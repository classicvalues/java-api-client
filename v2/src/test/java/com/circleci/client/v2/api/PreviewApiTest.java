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
import com.circleci.client.v2.model.ArtifactListResponse;
import com.circleci.client.v2.model.CheckoutKey;
import com.circleci.client.v2.model.CheckoutKeyInput;
import com.circleci.client.v2.model.CheckoutKeyListResponse;
import com.circleci.client.v2.model.EnvironmentVariableListResponse;
import com.circleci.client.v2.model.EnvironmentVariablePair;
import com.circleci.client.v2.model.EnvironmentVariablePair1;
import com.circleci.client.v2.model.JobDetails;
import com.circleci.client.v2.model.MessageResponse;
import com.circleci.client.v2.model.PipelineConfig;
import com.circleci.client.v2.model.PipelineLight;
import com.circleci.client.v2.model.PipelineListResponse;
import com.circleci.client.v2.model.PipelineWithWorkflows;
import com.circleci.client.v2.model.Project;
import com.circleci.client.v2.model.TestsResponse;
import com.circleci.client.v2.model.TriggerPipelineParameters;
import java.util.UUID;
import com.circleci.client.v2.model.User;
import com.circleci.client.v2.model.Workflow;
import com.circleci.client.v2.model.WorkflowJobListResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PreviewApi
 */
@Ignore
public class PreviewApiTest {

    private final PreviewApi api = new PreviewApi();

    
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
        MessageResponse response = api.cancelJob(jobNumber, projectSlug);

        // TODO: test validations
    }
    
    /**
     * Cancel a workflow
     *
     * Cancels a running workflow.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelWorkflowTest() throws ApiException {
        UUID id = null;
        MessageResponse response = api.cancelWorkflow(id);

        // TODO: test validations
    }
    
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
     * User Information
     *
     * Provides information about the user that is currently signed in.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentUserTest() throws ApiException {
        User response = api.getCurrentUser();

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
     * Get a job&#39;s artifacts
     *
     * Returns a job&#39;s artifacts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobArtifactsTest() throws ApiException {
        Object jobNumber = null;
        String projectSlug = null;
        ArtifactListResponse response = api.getJobArtifacts(jobNumber, projectSlug);

        // TODO: test validations
    }
    
    /**
     * Get job details
     *
     * Returns job details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobDetailsTest() throws ApiException {
        Object jobNumber = null;
        String projectSlug = null;
        JobDetails response = api.getJobDetails(jobNumber, projectSlug);

        // TODO: test validations
    }
    
    /**
     * Get a pipeline
     *
     * Returns a pipeline by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineByIdTest() throws ApiException {
        UUID pipelineId = null;
        PipelineWithWorkflows response = api.getPipelineById(pipelineId);

        // TODO: test validations
    }
    
    /**
     * Get a pipeline&#39;s configuration
     *
     * Returns a pipeline&#39;s configuration by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPipelineConfigByIdTest() throws ApiException {
        UUID pipelineId = null;
        PipelineConfig response = api.getPipelineConfigById(pipelineId);

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
     * Get test metadata
     *
     * Get test metadata for a build.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTestsTest() throws ApiException {
        Object jobNumber = null;
        String projectSlug = null;
        TestsResponse response = api.getTests(jobNumber, projectSlug);

        // TODO: test validations
    }
    
    /**
     * Get a workflow
     *
     * Returns summary fields of a workflow by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkflowByIdTest() throws ApiException {
        UUID id = null;
        Workflow response = api.getWorkflowById(id);

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
    
    /**
     * Get your pipelines
     *
     * Returns a sequence of all pipelines for this project triggered by the user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMyPipelinesTest() throws ApiException {
        String projectSlug = null;
        String pageToken = null;
        PipelineListResponse response = api.listMyPipelines(projectSlug, pageToken);

        // TODO: test validations
    }
    
    /**
     * Get all pipelines
     *
     * Returns all pipelines for this project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPipelinesForProjectTest() throws ApiException {
        String projectSlug = null;
        String pageToken = null;
        PipelineListResponse response = api.listPipelinesForProject(projectSlug, pageToken);

        // TODO: test validations
    }
    
    /**
     * Get a workflow&#39;s jobs
     *
     * Returns a sequence of jobs for a workflow.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listWorkflowJobsTest() throws ApiException {
        UUID id = null;
        WorkflowJobListResponse response = api.listWorkflowJobs(id);

        // TODO: test validations
    }
    
    /**
     * Trigger a new pipeline
     *
     * Triggers a new pipeline on the project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void triggerPipelineTest() throws ApiException {
        String projectSlug = null;
        TriggerPipelineParameters triggerPipelineParameters = null;
        PipelineLight response = api.triggerPipeline(projectSlug, triggerPipelineParameters);

        // TODO: test validations
    }
    
}
