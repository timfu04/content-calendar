package com.clementlee.contentcalendar.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "cc") // prefix of "cc"
public record ContentCalendarProperties(String welcomeMessage, String about) {
}
