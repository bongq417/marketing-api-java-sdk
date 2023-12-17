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
import com.tencent.ads.model.AdcreativeTemplatePreviewsGetRequest;
import com.tencent.ads.model.AdcreativeTemplatePreviewsGetResponse;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdcreativeTemplatePreviewsApi {
  private ApiClient apiClient;

  public AdcreativeTemplatePreviewsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AdcreativeTemplatePreviewsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for adcreativeTemplatePreviewsGet
   *
   * @param data (required)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public okhttp3.Call adcreativeTemplatePreviewsGetCall(
      AdcreativeTemplatePreviewsGetRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = data;

    // create path and map variables
    String localVarPath = "/adcreative_template_previews/get";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"application/json", "application/xml"};
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
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarFormParams,
        localVarAuthNames,
        progressRequestListener);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call adcreativeTemplatePreviewsGetValidateBeforeCall(
      AdcreativeTemplatePreviewsGetRequest data,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(
          "Missing the required parameter 'data' when calling adcreativeTemplatePreviewsGet(Async)");
    }

    okhttp3.Call call =
        adcreativeTemplatePreviewsGetCall(data, progressListener, progressRequestListener);
    return call;
  }

  /**
   * 获取广告创意预览
   *
   * @param data (required)
   * @return AdcreativeTemplatePreviewsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public AdcreativeTemplatePreviewsGetResponse adcreativeTemplatePreviewsGet(
      AdcreativeTemplatePreviewsGetRequest data) throws ApiException {
    ApiResponse<AdcreativeTemplatePreviewsGetResponse> resp =
        adcreativeTemplatePreviewsGetWithHttpInfo(data);
    return resp.getData();
  }

  /**
   * 获取广告创意预览
   *
   * @param data (required)
   * @return ApiResponse&lt;AdcreativeTemplatePreviewsGetResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<AdcreativeTemplatePreviewsGetResponse>
      adcreativeTemplatePreviewsGetWithHttpInfo(AdcreativeTemplatePreviewsGetRequest data)
          throws ApiException {
    okhttp3.Call call =
        adcreativeTemplatePreviewsGetValidateBeforeCall(data, null, null);
    Type localVarReturnType = new TypeToken<AdcreativeTemplatePreviewsGetResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 获取广告创意预览 (asynchronously)
   *
   * @param data (required)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public okhttp3.Call adcreativeTemplatePreviewsGetAsync(
      AdcreativeTemplatePreviewsGetRequest data,
      final ApiCallback<AdcreativeTemplatePreviewsGetResponse> callback)
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
        adcreativeTemplatePreviewsGetValidateBeforeCall(
            data, progressListener, progressRequestListener);
    Type localVarReturnType = new TypeToken<AdcreativeTemplatePreviewsGetResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
