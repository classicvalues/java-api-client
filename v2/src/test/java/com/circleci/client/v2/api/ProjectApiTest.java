/*
 * CircleCI API
 * This describes the resources that make up the CircleCI API v2. API v2 is currently in Preview. Additional documentation for this API can be found in the [API Preview Docs](https://github.com/CircleCI-Public/api-preview-docs/tree/master/docs). Breaking changes to the API will be announced in the [Breaking Changes log](https://github.com/CircleCI-Public/api-preview-docs/blob/master/docs/breaking.md).
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
import com.circleci.client.v2.model.CheckoutKey;
import com.circleci.client.v2.model.CheckoutKeyInput;
import com.circleci.client.v2.model.CheckoutKeyListResponse;
import com.circleci.client.v2.model.EnvironmentVariableListResponse;
import com.circleci.client.v2.model.EnvironmentVariablePair;
import com.circleci.client.v2.model.EnvironmentVariablePair1;
import com.circleci.client.v2.model.MessageResponse;
import com.circleci.client.v2.model.Project;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectApi
 */
@Ignore
public class ProjectApiTest {

    private final ProjectApi api = new ProjectApi();

    
    /**
     * Create a new checkout key
     *
     * Creates a new checkout key. This API request is only usable with a user API token.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCheckoutKeyTest() throws ApiException {
        String projectSlug = null;
        CheckoutKeyInput checkoutKeyInput = null;
        CheckoutKey response = api.createCheckoutKey(projectSlug, checkoutKeyInput);

        // TODO: test validations
    }
    
    /**
     * Create an environment variable
     *
     * Creates a new environment variable.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEnvVarTest() throws ApiException {
        String projectSlug = null;
        EnvironmentVariablePair1 environmentVariablePair1 = null;
        EnvironmentVariablePair response = api.createEnvVar(projectSlug, environmentVariablePair1);

        // TODO: test validations
    }
    
    /**
     * Delete a checkout key
     *
     * Deletes the checkout key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCheckoutKeyTest() throws ApiException {
        String projectSlug = null;
        String fingerprint = null;
        MessageResponse response = api.deleteCheckoutKey(projectSlug, fingerprint);

        // TODO: test validations
    }
    
    /**
     * Delete an environment variable
     *
     * Deletes the environment variable named :name.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEnvVarTest() throws ApiException {
        String projectSlug = null;
        String name = null;
        MessageResponse response = api.deleteEnvVar(projectSlug, name);

        // TODO: test validations
    }
    
    /**
     * Get a checkout key
     *
     * Returns an individual checkout key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCheckoutKeyTest() throws ApiException {
        String projectSlug = null;
        String fingerprint = null;
        CheckoutKey response = api.getCheckoutKey(projectSlug, fingerprint);

        // TODO: test validations
    }
    
    /**
     * Get masked environment variables
     *
     * Returns the masked value of environment variable :name.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEnvVarTest() throws ApiException {
        String projectSlug = null;
        String name = null;
        EnvironmentVariablePair response = api.getEnvVar(projectSlug, name);

        // TODO: test validations
    }
    
    /**
     * Get a project
     *
     * Retrieves a project by project slug.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProjectBySlugTest() throws ApiException {
        String projectSlug = null;
        Project response = api.getProjectBySlug(projectSlug);

        // TODO: test validations
    }
    
    /**
     * Get all checkout keys
     *
     * Returns a sequence of checkout keys for &#x60;:project&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCheckoutKeysTest() throws ApiException {
        String projectSlug = null;
        CheckoutKeyListResponse response = api.listCheckoutKeys(projectSlug);

        // TODO: test validations
    }
    
    /**
     * Get an environment variable
     *
     * Returns four &#39;x&#39; characters, in addition to the last four ASCII characters of the value, consistent with the display of environment variable values on the CircleCI website.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listEnvVarsTest() throws ApiException {
        String projectSlug = null;
        EnvironmentVariableListResponse response = api.listEnvVars(projectSlug);

        // TODO: test validations
    }
    
}
