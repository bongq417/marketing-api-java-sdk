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
import com.tencent.ads.model.XijingPageListGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XijingPageListApi {
  private ApiClient apiClient;

  public XijingPageListApi() {
    this(Configuration.getDefaultApiClient());
  }

  public XijingPageListApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for xijingPageListGet
   *
   * @param accountId (required)
   * @param pageId (optional)
   * @param pageServiceId (optional)
   * @param pageName (optional)
   * @param pageType (optional)
   * @param pageLastModifyStartTime (optional)
   * @param pageLastModifyEndTime (optional)
   * @param pageSize (optional)
   * @param pageIndex (optional)
   * @param pagePublishStatus (optional)
   * @param pageStatus (optional)
   * @param pageSource (optional)
   * @param pageOwnerId (optional)
   * @param appId (optional)
   * @param appType (optional)
   * @param queryType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public okhttp3.Call xijingPageListGetCall(
      Long accountId,
      Long pageId,
      String pageServiceId,
      String pageName,
      List<String> pageType,
      String pageLastModifyStartTime,
      String pageLastModifyEndTime,
      Long pageSize,
      Long pageIndex,
      List<String> pagePublishStatus,
      List<String> pageStatus,
      String pageSource,
      Long pageOwnerId,
      Long appId,
      String appType,
      String queryType,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/xijing_page_list/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (pageId != null) localVarQueryParams.addAll(apiClient.parameterToPair("page_id", pageId));
    if (pageServiceId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_service_id", pageServiceId));
    if (pageName != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_name", pageName));
    if (pageType != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "page_type", pageType));
    if (pageLastModifyStartTime != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("page_last_modify_start_time", pageLastModifyStartTime));
    if (pageLastModifyEndTime != null)
      localVarQueryParams.addAll(
          apiClient.parameterToPair("page_last_modify_end_time", pageLastModifyEndTime));
    if (pageSize != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_size", pageSize));
    if (pageIndex != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_index", pageIndex));
    if (pagePublishStatus != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "page_publish_status", pagePublishStatus));
    if (pageStatus != null)
      localVarCollectionQueryParams.addAll(
          apiClient.parameterToPairs("multi", "page_status", pageStatus));
    if (pageSource != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_source", pageSource));
    if (pageOwnerId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("page_owner_id", pageOwnerId));
    if (appId != null) localVarQueryParams.addAll(apiClient.parameterToPair("app_id", appId));
    if (appType != null) localVarQueryParams.addAll(apiClient.parameterToPair("app_type", appType));
    if (queryType != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("query_type", queryType));
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
  private okhttp3.Call xijingPageListGetValidateBeforeCall(
      Long accountId,
      Long pageId,
      String pageServiceId,
      String pageName,
      List<String> pageType,
      String pageLastModifyStartTime,
      String pageLastModifyEndTime,
      Long pageSize,
      Long pageIndex,
      List<String> pagePublishStatus,
      List<String> pageStatus,
      String pageSource,
      Long pageOwnerId,
      Long appId,
      String appType,
      String queryType,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling xijingPageListGet(Async)");
    }

    okhttp3.Call call =
        xijingPageListGetCall(
            accountId,
            pageId,
            pageServiceId,
            pageName,
            pageType,
            pageLastModifyStartTime,
            pageLastModifyEndTime,
            pageSize,
            pageIndex,
            pagePublishStatus,
            pageStatus,
            pageSource,
            pageOwnerId,
            appId,
            appType,
            queryType,
            fields,
            progressListener,
            progressRequestListener);
    return call;
  }

  /**
   * 蹊径-获取落地页列表
   *
   * @param accountId (required)
   * @param pageId (optional)
   * @param pageServiceId (optional)
   * @param pageName (optional)
   * @param pageType (optional)
   * @param pageLastModifyStartTime (optional)
   * @param pageLastModifyEndTime (optional)
   * @param pageSize (optional)
   * @param pageIndex (optional)
   * @param pagePublishStatus (optional)
   * @param pageStatus (optional)
   * @param pageSource (optional)
   * @param pageOwnerId (optional)
   * @param appId (optional)
   * @param appType (optional)
   * @param queryType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return XijingPageListGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public XijingPageListGetResponse xijingPageListGet(
      Long accountId,
      Long pageId,
      String pageServiceId,
      String pageName,
      List<String> pageType,
      String pageLastModifyStartTime,
      String pageLastModifyEndTime,
      Long pageSize,
      Long pageIndex,
      List<String> pagePublishStatus,
      List<String> pageStatus,
      String pageSource,
      Long pageOwnerId,
      Long appId,
      String appType,
      String queryType,
      List<String> fields)
      throws ApiException {
    ApiResponse<XijingPageListGetResponse> resp =
        xijingPageListGetWithHttpInfo(
            accountId,
            pageId,
            pageServiceId,
            pageName,
            pageType,
            pageLastModifyStartTime,
            pageLastModifyEndTime,
            pageSize,
            pageIndex,
            pagePublishStatus,
            pageStatus,
            pageSource,
            pageOwnerId,
            appId,
            appType,
            queryType,
            fields);
    return resp.getData();
  }

  /**
   * 蹊径-获取落地页列表
   *
   * @param accountId (required)
   * @param pageId (optional)
   * @param pageServiceId (optional)
   * @param pageName (optional)
   * @param pageType (optional)
   * @param pageLastModifyStartTime (optional)
   * @param pageLastModifyEndTime (optional)
   * @param pageSize (optional)
   * @param pageIndex (optional)
   * @param pagePublishStatus (optional)
   * @param pageStatus (optional)
   * @param pageSource (optional)
   * @param pageOwnerId (optional)
   * @param appId (optional)
   * @param appType (optional)
   * @param queryType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;XijingPageListGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<XijingPageListGetResponse> xijingPageListGetWithHttpInfo(
      Long accountId,
      Long pageId,
      String pageServiceId,
      String pageName,
      List<String> pageType,
      String pageLastModifyStartTime,
      String pageLastModifyEndTime,
      Long pageSize,
      Long pageIndex,
      List<String> pagePublishStatus,
      List<String> pageStatus,
      String pageSource,
      Long pageOwnerId,
      Long appId,
      String appType,
      String queryType,
      List<String> fields)
      throws ApiException {
    okhttp3.Call call =
        xijingPageListGetValidateBeforeCall(
            accountId,
            pageId,
            pageServiceId,
            pageName,
            pageType,
            pageLastModifyStartTime,
            pageLastModifyEndTime,
            pageSize,
            pageIndex,
            pagePublishStatus,
            pageStatus,
            pageSource,
            pageOwnerId,
            appId,
            appType,
            queryType,
            fields,
            null,
            null);
    Type localVarReturnType = new TypeToken<XijingPageListGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 蹊径-获取落地页列表 (asynchronously)
   *
   * @param accountId (required)
   * @param pageId (optional)
   * @param pageServiceId (optional)
   * @param pageName (optional)
   * @param pageType (optional)
   * @param pageLastModifyStartTime (optional)
   * @param pageLastModifyEndTime (optional)
   * @param pageSize (optional)
   * @param pageIndex (optional)
   * @param pagePublishStatus (optional)
   * @param pageStatus (optional)
   * @param pageSource (optional)
   * @param pageOwnerId (optional)
   * @param appId (optional)
   * @param appType (optional)
   * @param queryType (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public okhttp3.Call xijingPageListGetAsync(
      Long accountId,
      Long pageId,
      String pageServiceId,
      String pageName,
      List<String> pageType,
      String pageLastModifyStartTime,
      String pageLastModifyEndTime,
      Long pageSize,
      Long pageIndex,
      List<String> pagePublishStatus,
      List<String> pageStatus,
      String pageSource,
      Long pageOwnerId,
      Long appId,
      String appType,
      String queryType,
      List<String> fields,
      final ApiCallback<XijingPageListGetResponse> callback)
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
        xijingPageListGetValidateBeforeCall(
            accountId,
            pageId,
            pageServiceId,
            pageName,
            pageType,
            pageLastModifyStartTime,
            pageLastModifyEndTime,
            pageSize,
            pageIndex,
            pagePublishStatus,
            pageStatus,
            pageSource,
            pageOwnerId,
            appId,
            appType,
            queryType,
            fields,
            progressListener,
            progressRequestListener);
    Type localVarReturnType = new TypeToken<XijingPageListGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
