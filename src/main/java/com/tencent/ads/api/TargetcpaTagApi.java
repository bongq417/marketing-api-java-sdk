/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.api;

import com.google.gson.reflect.TypeToken;
import com.tencent.ads.ApiCallback;
import com.tencent.ads.ApiClient;
import com.tencent.ads.ApiException;
import com.tencent.ads.ApiResponse;
import com.tencent.ads.Configuration;
import com.tencent.ads.Pair;
import com.tencent.ads.ProgressRequestBody;
import com.tencent.ads.ProgressResponseBody;
import com.tencent.ads.model.TargetcpaTagGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TargetcpaTagApi {
  private ApiClient apiClient;

  public TargetcpaTagApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TargetcpaTagApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for targetcpaTagGet
   *
   * @param accountId (required)
   * @param tagTypes (required)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public okhttp3.Call targetcpaTagGetCall(
      Long accountId,
      List<String> tagTypes,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/targetcpa_tag/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (tagTypes != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "tag_types", tagTypes));
    if (fields != null)
      localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "fields", fields));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"text/plain"};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    if (progressListener != null) {
      apiClient
          .getHttpClient()
          .networkInterceptors()
          .add(
              new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(
                    okhttp3.Interceptor.Chain chain) throws IOException {
                  okhttp3.Response originalResponse = chain.proceed(chain.request());
                  return originalResponse
                      .newBuilder()
                      .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                      .build();
                }
              });
    }

    String[] localVarAuthNames = new String[] {"accessToken", "nonce", "timestamp"};
    return apiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAuthNames,
        progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call targetcpaTagGetValidateBeforeCall(
      Long accountId,
      List<String> tagTypes,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling targetcpaTagGet(Async)");
    }

    // verify the required parameter 'tagTypes' is set
    if (tagTypes == null) {
      throw new ApiException(
          "Missing the required parameter 'tagTypes' when calling targetcpaTagGet(Async)");
    }

    okhttp3.Call call =
        targetcpaTagGetCall(accountId, tagTypes, fields, progressListener, progressRequestListener);
    return call;
  }

  /**
   * 获取分人群出价标签
   *
   * @param accountId (required)
   * @param tagTypes (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return TargetcpaTagGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public TargetcpaTagGetResponse targetcpaTagGet(
      Long accountId, List<String> tagTypes, List<String> fields) throws ApiException {
    ApiResponse<TargetcpaTagGetResponse> resp =
        targetcpaTagGetWithHttpInfo(accountId, tagTypes, fields);
    return resp.getData();
  }

  /**
   * 获取分人群出价标签
   *
   * @param accountId (required)
   * @param tagTypes (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;TargetcpaTagGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<TargetcpaTagGetResponse> targetcpaTagGetWithHttpInfo(
      Long accountId, List<String> tagTypes, List<String> fields) throws ApiException {
    okhttp3.Call call =
        targetcpaTagGetValidateBeforeCall(accountId, tagTypes, fields, null, null);
    Type localVarReturnType = new TypeToken<TargetcpaTagGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取分人群出价标签 (asynchronously)
   *
   * @param accountId (required)
   * @param tagTypes (required)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public okhttp3.Call targetcpaTagGetAsync(
      Long accountId,
      List<String> tagTypes,
      List<String> fields,
      final ApiCallback<TargetcpaTagGetResponse> callback)
      throws ApiException {

    ProgressResponseBody.ProgressListener progressListener = null;
    ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

    if (callback != null) {
      progressListener =
          new ProgressResponseBody.ProgressListener() {
            @Override
            public void update(long bytesRead, long contentLength, boolean done) {
              callback.onDownloadProgress(bytesRead, contentLength, done);
            }
          };

      progressRequestListener =
          new ProgressRequestBody.ProgressRequestListener() {
            @Override
            public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
              callback.onUploadProgress(bytesWritten, contentLength, done);
            }
          };
    }

    okhttp3.Call call =
        targetcpaTagGetValidateBeforeCall(
            accountId, tagTypes, fields, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<TargetcpaTagGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
