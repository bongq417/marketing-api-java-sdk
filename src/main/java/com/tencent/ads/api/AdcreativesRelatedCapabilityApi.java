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
import com.tencent.ads.model.AdcreativesRelatedCapabilityGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdcreativesRelatedCapabilityApi {
  private ApiClient apiClient;

  public AdcreativesRelatedCapabilityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdcreativesRelatedCapabilityApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for adcreativesRelatedCapabilityGet
   *
   * @param accountId (required)
   * @param adId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public okhttp3.Call adcreativesRelatedCapabilityGetCall(
      Long accountId,
      Long adId,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/adcreatives_related_capability/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (adId != null) localVarQueryParams.addAll(apiClient.parameterToPair("ad_id", adId));
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
  private okhttp3.Call adcreativesRelatedCapabilityGetValidateBeforeCall(
      Long accountId,
      Long adId,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling adcreativesRelatedCapabilityGet(Async)");
    }

    // verify the required parameter 'adId' is set
    if (adId == null) {
      throw new ApiException(
          "Missing the required parameter 'adId' when calling adcreativesRelatedCapabilityGet(Async)");
    }

    okhttp3.Call call =
        adcreativesRelatedCapabilityGetCall(
            accountId, adId, fields, progressListener, progressRequestListener);
    return call;
  }

  /**
   * 检查广告创意是否可以修改
   *
   * @param accountId (required)
   * @param adId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return AdcreativesRelatedCapabilityGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdcreativesRelatedCapabilityGetResponse adcreativesRelatedCapabilityGet(
      Long accountId, Long adId, List<String> fields) throws ApiException {
    ApiResponse<AdcreativesRelatedCapabilityGetResponse> resp =
        adcreativesRelatedCapabilityGetWithHttpInfo(accountId, adId, fields);
    return resp.getData();
  }

  /**
   * 检查广告创意是否可以修改
   *
   * @param accountId (required)
   * @param adId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;AdcreativesRelatedCapabilityGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<AdcreativesRelatedCapabilityGetResponse>
      adcreativesRelatedCapabilityGetWithHttpInfo(Long accountId, Long adId, List<String> fields)
          throws ApiException {
    okhttp3.Call call =
        adcreativesRelatedCapabilityGetValidateBeforeCall(accountId, adId, fields, null, null);
    Type localVarReturnType = new TypeToken<AdcreativesRelatedCapabilityGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 检查广告创意是否可以修改 (asynchronously)
   *
   * @param accountId (required)
   * @param adId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public okhttp3.Call adcreativesRelatedCapabilityGetAsync(
      Long accountId,
      Long adId,
      List<String> fields,
      final ApiCallback<AdcreativesRelatedCapabilityGetResponse> callback)
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
        adcreativesRelatedCapabilityGetValidateBeforeCall(
            accountId, adId, fields, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<AdcreativesRelatedCapabilityGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
