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
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthorizationApi {
  private ApiClient apiClient;

  public AuthorizationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthorizationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for authorizationWechatBind
   *
   * @param accessToken (required)
   * @param redirectUri (required)
   * @param accountId 需绑定公众号的广告主 id，有操作权限的帐号 id (optional)
   * @param wechatAccountId 微信公众号id，用于判断扫描的公众号与请求时的wechat_account_id是否一致 (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public okhttp3.Call authorizationWechatBindCall(
      String accessToken,
      String redirectUri,
      Long accountId,
      String wechatAccountId,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/authorization/wechat_bind";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (accessToken != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("access_token", accessToken));
    if (redirectUri != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("redirect_uri", redirectUri));
    if (accountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("account_id", accountId));
    if (wechatAccountId != null)
      localVarQueryParams.addAll(apiClient.parameterToPair("wechat_account_id", wechatAccountId));
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

    String[] localVarAuthNames = new String[] {};
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
  private okhttp3.Call authorizationWechatBindValidateBeforeCall(
      String accessToken,
      String redirectUri,
      Long accountId,
      String wechatAccountId,
      List<String> fields,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'accessToken' is set
    if (accessToken == null) {
      throw new ApiException(
          "Missing the required parameter 'accessToken' when calling authorizationWechatBind(Async)");
    }

    // verify the required parameter 'redirectUri' is set
    if (redirectUri == null) {
      throw new ApiException(
          "Missing the required parameter 'redirectUri' when calling authorizationWechatBind(Async)");
    }

    okhttp3.Call call =
        authorizationWechatBindCall(
            accessToken,
            redirectUri,
            accountId,
            wechatAccountId,
            fields,
            progressListener,
            progressRequestListener);
    return call;
  }

  /**
   * 绑定微信公众号(待废弃)
   *
   * @param accessToken (required)
   * @param redirectUri (required)
   * @param accountId 需绑定公众号的广告主 id，有操作权限的帐号 id (optional)
   * @param wechatAccountId 微信公众号id，用于判断扫描的公众号与请求时的wechat_account_id是否一致 (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return String
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public String authorizationWechatBind(
      String accessToken,
      String redirectUri,
      Long accountId,
      String wechatAccountId,
      List<String> fields)
      throws ApiException {
    ApiResponse<String> resp =
        authorizationWechatBindWithHttpInfo(
            accessToken, redirectUri, accountId, wechatAccountId, fields);
    return resp.getData();
  }

  /**
   * 绑定微信公众号(待废弃)
   *
   * @param accessToken (required)
   * @param redirectUri (required)
   * @param accountId 需绑定公众号的广告主 id，有操作权限的帐号 id (optional)
   * @param wechatAccountId 微信公众号id，用于判断扫描的公众号与请求时的wechat_account_id是否一致 (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<String> authorizationWechatBindWithHttpInfo(
      String accessToken,
      String redirectUri,
      Long accountId,
      String wechatAccountId,
      List<String> fields)
      throws ApiException {
    okhttp3.Call call =
        authorizationWechatBindValidateBeforeCall(
            accessToken, redirectUri, accountId, wechatAccountId, fields, null, null);
    Type localVarReturnType = new TypeToken<String>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 绑定微信公众号(待废弃) (asynchronously)
   *
   * @param accessToken (required)
   * @param redirectUri (required)
   * @param accountId 需绑定公众号的广告主 id，有操作权限的帐号 id (optional)
   * @param wechatAccountId 微信公众号id，用于判断扫描的公众号与请求时的wechat_account_id是否一致 (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public okhttp3.Call authorizationWechatBindAsync(
      String accessToken,
      String redirectUri,
      Long accountId,
      String wechatAccountId,
      List<String> fields,
      final ApiCallback<String> callback)
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
        authorizationWechatBindValidateBeforeCall(
            accessToken,
            redirectUri,
            accountId,
            wechatAccountId,
            fields,
            progressListener,
            progressRequestListener);
    Type localVarReturnType = new TypeToken<String>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
