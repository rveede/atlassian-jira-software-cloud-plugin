package com.atlassian.jira.cloud.jenkins.common.config;

import com.atlassian.jira.cloud.jenkins.config.JiraCloudSiteConfig;

import java.util.Optional;

public interface JiraSiteConfigRetriever {

    Optional<JiraCloudSiteConfig> getJiraSiteConfig(String jiraSite);
}