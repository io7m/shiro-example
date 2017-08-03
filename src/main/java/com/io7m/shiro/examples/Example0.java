package com.io7m.shiro.examples;

import org.apache.shiro.config.Ini;
import org.apache.shiro.env.DefaultEnvironment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class Example0
{
  private static final Logger LOG =
    LoggerFactory.getLogger(Example0.class);

  private Example0()
  {

  }

  public static void main(
    final String[] args)
    throws IOException
  {
    final Ini ini = new Ini();
    try (final InputStream in =
           Files.newInputStream(Paths.get("config.ini"))) {
      ini.load(in);
    }

    final DefaultEnvironment env = new DefaultEnvironment(ini);
    env.getSecurityManager();
  }
}
