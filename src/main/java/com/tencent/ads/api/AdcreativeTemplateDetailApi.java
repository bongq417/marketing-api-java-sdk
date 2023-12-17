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
import com.tencent.ads.model.AdcreativeTemplateDetailGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdcreativeTemplateDetailApi {
  private ApiClient apiClient;

  public AdcreativeTemplateDetailApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdcreativeTemplateDetailApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for adcreativeTemplateDetailGet
   *
   * @param adcreativeTemplateId (required)
   * @param promotedObjectType (required)
   * @param accountId (optional)
   * @param automaticSiteEnabled (optional)
   * @param siteSet (optional)
   * @param isDynamicCreativeAd (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public okhttp3.Call adcreativeTemplateDetailGetCall(
      Long adcreativeTemplateId,
      String promotedObjectType,
      Long accountId,
      Boolean automaticSiteEnabled,
      List<String> siteSet,
      Boolean isDynamicCreativeAd,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/adcreative_template_detail/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (adcreativeTemplateId != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("adcreative_template_id", adcreativeTemplateId));
    if (promotedObjectType != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("promoted_object_type", promotedObjectType));
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (automaticSiteEnabled != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("automatic_site_enabled", automaticSiteEnabled));
    if (siteSet != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "site_set", siteSet));
    if (isDynamicCreativeAd != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("is_dynamic_creative_ad", isDynamicCreativeAd));
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
  private okhttp3.Call adcreativeTemplateDetailGetValidateBeforeCall(
      Long adcreativeTemplateId,
      String promotedObjectType,
      Long accountId,
      Boolean automaticSiteEnabled,
      List<String> siteSet,
      Boolean isDynamicCreativeAd,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'adcreativeTemplateId' is set
    if (adcreativeTemplateId == null) {
      throw new ApiException(
          "Missing the required parameter 'adcreativeTemplateId' when calling adcreativeTemplateDetailGet(Async)");
    }

    // verify the required parameter 'promotedObjectType' is set
    if (promotedObjectType == null) {
      throw new ApiException(
          "Missing the required parameter 'promotedObjectType' when calling adcreativeTemplateDetailGet(Async)");
    }

    okhttp3.Call call =
        adcreativeTemplateDetailGetCall(
            adcreativeTemplateId,
            promotedObjectType,
            accountId,
            automaticSiteEnabled,
            siteSet,
            isDynamicCreativeAd,
            fields,
            progressListener,
            progressRequestListener);
    return call;
  }

  /**
   * 获取创意规格信息
   *
   * @param adcreativeTemplateId (required)
   * @param promotedObjectType (required)
   * @param accountId (optional)
   * @param automaticSiteEnabled (optional)
   * @param siteSet (optional)
   * @param isDynamicCreativeAd (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return AdcreativeTemplateDetailGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdcreativeTemplateDetailGetResponse adcreativeTemplateDetailGet(
      Long adcreativeTemplateId,
      String promotedObjectType,
      Long accountId,
      Boolean automaticSiteEnabled,
      List<String> siteSet,
      Boolean isDynamicCreativeAd,
      List<String> fields)
      throws ApiException {
    ApiResponse<AdcreativeTemplateDetailGetResponse> resp =
        adcreativeTemplateDetailGetWithHttpInfo(
            adcreativeTemplateId,
            promotedObjectType,
            accountId,
            automaticSiteEnabled,
            siteSet,
            isDynamicCreativeAd,
            fields);
    return resp.getData();
  }

  /**
   * 获取创意规格信息
   *
   * @param adcreativeTemplateId (required)
   * @param promotedObjectType (required)
   * @param accountId (optional)
   * @param automaticSiteEnabled (optional)
   * @param siteSet (optional)
   * @param isDynamicCreativeAd (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;AdcreativeTemplateDetailGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<AdcreativeTemplateDetailGetResponse> adcreativeTemplateDetailGetWithHttpInfo(
      Long adcreativeTemplateId,
      String promotedObjectType,
      Long accountId,
      Boolean automaticSiteEnabled,
      List<String> siteSet,
      Boolean isDynamicCreativeAd,
      List<String> fields)
      throws ApiException {
    okhttp3.Call call =
        adcreativeTemplateDetailGetValidateBeforeCall(
            adcreativeTemplateId,
            promotedObjectType,
            accountId,
            automaticSiteEnabled,
            siteSet,
            isDynamicCreativeAd,
            fields,
            null,
            null);
    Type localVarReturnType = new TypeToken<AdcreativeTemplateDetailGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取创意规格信息 (asynchronously)
   *
   * @param adcreativeTemplateId (required)
   * @param promotedObjectType (required)
   * @param accountId (optional)
   * @param automaticSiteEnabled (optional)
   * @param siteSet (optional)
   * @param isDynamicCreativeAd (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public okhttp3.Call adcreativeTemplateDetailGetAsync(
      Long adcreativeTemplateId,
      String promotedObjectType,
      Long accountId,
      Boolean automaticSiteEnabled,
      List<String> siteSet,
      Boolean isDynamicCreativeAd,
      List<String> fields,
      final ApiCallback<AdcreativeTemplateDetailGetResponse> callback)
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
        adcreativeTemplateDetailGetValidateBeforeCall(
            adcreativeTemplateId,
            promotedObjectType,
            accountId,
            automaticSiteEnabled,
            siteSet,
            isDynamicCreativeAd,
            fields,
            progressListener,
            progressRequestListener);
    Type localVarReturnType = new TypeToken<AdcreativeTemplateDetailGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
