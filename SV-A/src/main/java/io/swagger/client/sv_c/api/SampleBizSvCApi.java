/*
 * Host-like WEB APIs with Swagger.
 * This is a practice to make host-like WEB APIs with Swagger generated code.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: akahane.yasuhiko@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.sv_c.api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.google.gson.reflect.TypeToken;
import io.swagger.client.sv_c.ApiCallback;
import io.swagger.client.sv_c.ApiClient;
import io.swagger.client.sv_c.ApiException;
import io.swagger.client.sv_c.ApiResponse;
import io.swagger.client.sv_c.Configuration;
import io.swagger.client.sv_c.Pair;
import io.swagger.client.sv_c.ProgressRequestBody;
import io.swagger.client.sv_c.ProgressResponseBody;
import io.swagger.client.sv_c.model.Sbz003cReq;
import io.swagger.client.sv_c.model.Sbz003cRes;

@Component
public class SampleBizSvCApi {
    private ApiClient apiClient;

    public SampleBizSvCApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SampleBizSvCApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for sbz003
     * @param body description here (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call sbz003Call(Sbz003cReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/sbz003";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call sbz003ValidateBeforeCall(Sbz003cReq body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling sbz003(Async)");
        }

        com.squareup.okhttp.Call call = sbz003Call(body, progressListener, progressRequestListener);
        return call;





    }

    /**
     * The API return various items by status code.
     *
     * @param body description here (required)
     * @return Sbz003cRes
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Sbz003cRes sbz003(Sbz003cReq body) throws ApiException {
        ApiResponse<Sbz003cRes> resp = sbz003WithHttpInfo(body);
        return resp.getData();
    }

    /**
     * The API return various items by status code.
     *
     * @param body description here (required)
     * @return ApiResponse&lt;Sbz003cRes&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Sbz003cRes> sbz003WithHttpInfo(Sbz003cReq body) throws ApiException {
        com.squareup.okhttp.Call call = sbz003ValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Sbz003cRes>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * The API return various items by status code. (asynchronously)
     *
     * @param body description here (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sbz003Async(Sbz003cReq body, final ApiCallback<Sbz003cRes> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = sbz003ValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Sbz003cRes>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
