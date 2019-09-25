/*
 * CircleCI API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.circleci.client.v2.api;

import com.circleci.client.v2.ApiException;
import com.circleci.client.v2.model.Message;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobApi
 */
@Ignore
public class JobApiTest {

    private final JobApi api = new JobApi();

    
    /**
     * Cancel job
     *
     * Cancel job with a given job number.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelJobTest() throws ApiException {
        Object jobNumber = null;
        String projectSlug = null;
        Message response = api.cancelJob(jobNumber, projectSlug);

        // TODO: test validations
    }
    
}
