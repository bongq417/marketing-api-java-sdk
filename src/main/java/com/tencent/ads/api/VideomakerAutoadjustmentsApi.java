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
import com.tencent.ads.model.ManualAdjustment;
import com.tencent.ads.model.SmartAdjustment;
import com.tencent.ads.model.VideomakerAutoadjustmentsAddResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideomakerAutoadjustmentsApi {
  private ApiClient apiClient;

  public VideomakerAutoadjustmentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VideomakerAutoadjustmentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Build call for videomakerAutoadjustmentsAdd
   *
   * @param accountId (required)
   * @param adjustmentType (required)
   * @param videoId (optional)
   * @param videoFile (optional)
   * @param signature (optional)
   * @param smartAdjustment (optional)
   * @param manualAdjustment (optional)
   * @param progressListener Progress listener
   * @param progressRequestListener Progress request listener
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   */
  public okhttp3.Call videomakerAutoadjustmentsAddCall(
      Long accountId,
      String adjustmentType,
      String videoId,
      File videoFile,
      String signature,
      SmartAdjustment smartAdjustment,
      ManualAdjustment manualAdjustment,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/videomaker_autoadjustments/add";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    if (accountId != null) localVarFormParams.put("account_id", accountId);
    if (videoId != null) localVarFormParams.put("video_id", videoId);
    if (videoFile != null) localVarFormParams.put("video_file", videoFile);
    if (signature != null) localVarFormParams.put("signature", signature);
    if (adjustmentType != null) localVarFormParams.put("adjustment_type", adjustmentType);
    if (smartAdjustment != null) localVarFormParams.put("smart_adjustment", smartAdjustment);
    if (manualAdjustment != null) localVarFormParams.put("manual_adjustment", manualAdjustment);

    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

    final String[] localVarContentTypes = {"multipart/form-data"};
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
  private okhttp3.Call videomakerAutoadjustmentsAddValidateBeforeCall(
      Long accountId,
      String adjustmentType,
      String videoId,
      File videoFile,
      String signature,
      SmartAdjustment smartAdjustment,
      ManualAdjustment manualAdjustment,
      final ProgressResponseBody.ProgressListener progressListener,
      final ProgressRequestBody.ProgressRequestListener progressRequestListener)
      throws ApiException {

    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(
          "Missing the required parameter 'accountId' when calling videomakerAutoadjustmentsAdd(Async)");
    }

    // verify the required parameter 'adjustmentType' is set
    if (adjustmentType == null) {
      throw new ApiException(
          "Missing the required parameter 'adjustmentType' when calling videomakerAutoadjustmentsAdd(Async)");
    }

    okhttp3.Call call =
        videomakerAutoadjustmentsAddCall(
            accountId,
            adjustmentType,
            videoId,
            videoFile,
            signature,
            smartAdjustment,
            manualAdjustment,
            progressListener,
            progressRequestListener);
    return call;
  }

  /**
   * 创建智能调整任务
   *
   * @param accountId (required)
   * @param adjustmentType (required)
   * @param videoId (optional)
   * @param videoFile (optional)
   * @param signature (optional)
   * @param smartAdjustment (optional)
   * @param manualAdjustment (optional)
   * @return VideomakerAutoadjustmentsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public VideomakerAutoadjustmentsAddResponse videomakerAutoadjustmentsAdd(
      Long accountId,
      String adjustmentType,
      String videoId,
      File videoFile,
      String signature,
      SmartAdjustment smartAdjustment,
      ManualAdjustment manualAdjustment)
      throws ApiException {
    ApiResponse<VideomakerAutoadjustmentsAddResponse> resp =
        videomakerAutoadjustmentsAddWithHttpInfo(
            accountId,
            adjustmentType,
            videoId,
            videoFile,
            signature,
            smartAdjustment,
            manualAdjustment);
    return resp.getData();
  }

  /**
   * 创建智能调整任务
   *
   * @param accountId (required)
   * @param adjustmentType (required)
   * @param videoId (optional)
   * @param videoFile (optional)
   * @param signature (optional)
   * @param smartAdjustment (optional)
   * @param manualAdjustment (optional)
   * @return ApiResponse&lt;VideomakerAutoadjustmentsAddResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ApiResponse<VideomakerAutoadjustmentsAddResponse> videomakerAutoadjustmentsAddWithHttpInfo(
      Long accountId,
      String adjustmentType,
      String videoId,
      File videoFile,
      String signature,
      SmartAdjustment smartAdjustment,
      ManualAdjustment manualAdjustment)
      throws ApiException {
    okhttp3.Call call =
        videomakerAutoadjustmentsAddValidateBeforeCall(
            accountId,
            adjustmentType,
            videoId,
            videoFile,
            signature,
            smartAdjustment,
            manualAdjustment,
            null,
            null);
    Type localVarReturnType = new TypeToken<VideomakerAutoadjustmentsAddResponse>() {}.getType();
    return apiClient.execute(call, localVarReturnType);
  }

  /**
   * 创建智能调整任务 (asynchronously)
   *
   * @param accountId (required)
   * @param adjustmentType (required)
   * @param videoId (optional)
   * @param videoFile (optional)
   * @param signature (optional)
   * @param smartAdjustment (optional)
   * @param manualAdjustment (optional)
   * @param callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   */
  public okhttp3.Call videomakerAutoadjustmentsAddAsync(
      Long accountId,
      String adjustmentType,
      String videoId,
      File videoFile,
      String signature,
      SmartAdjustment smartAdjustment,
      ManualAdjustment manualAdjustment,
      final ApiCallback<VideomakerAutoadjustmentsAddResponse> callback)
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
        videomakerAutoadjustmentsAddValidateBeforeCall(
            accountId,
            adjustmentType,
            videoId,
            videoFile,
            signature,
            smartAdjustment,
            manualAdjustment,
            progressListener,
            progressRequestListener);
    Type localVarReturnType = new TypeToken<VideomakerAutoadjustmentsAddResponse>() {}.getType();
    apiClient.executeAsync(call, localVarReturnType, callback);
    return call;
  }
}
