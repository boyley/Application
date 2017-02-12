package com.github.angle.config;

/**
 * Created by lenovo on 2016/11/22.
 */
public final class Constants {
    private Constants() {
    }

    public static final String LOGIN_REGEX = "^[_'.@A-Za-z0-9-]*$";
    public static final String SPRING_PROFILE_DEVELOPMENT = "dev";
    public static final String SPRING_PROFILE_PRODUCTION = "prod";
    public static final String SPRING_PROFILE_CLOUD = "cloud";
    public static final String SPRING_PROFILE_HEROKU = "heroku";
    public static final String SPRING_PROFILE_SWAGGER = "swagger";
    public static final String SPRING_PROFILE_NO_LIQUIBASE = "no-liquibase";
    public static final String SYSTEM_ACCOUNT = "system";
}
