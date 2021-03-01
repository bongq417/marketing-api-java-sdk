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

package com.tencent.ads.container;

import com.google.inject.Inject;
import com.tencent.ads.ApiContainer;
import com.tencent.ads.ApiException;
import com.tencent.ads.anno.*;
import com.tencent.ads.api.VideomakerVideocapturesApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.VideomakerVideocapturesAddResponse;
import com.tencent.ads.model.VideomakerVideocapturesAddResponseData;
import java.io.File;

public class VideomakerVideocapturesApiContainer extends ApiContainer {

  @Inject VideomakerVideocapturesApi api;

  /**
   * 生成视频封面图
   *
   * @param accountId (required)
   * @param videoId (optional)
   * @param videoFile (optional)
   * @param signature (optional)
   * @param number (optional)
   * @return VideomakerVideocapturesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public VideomakerVideocapturesAddResponseData videomakerVideocapturesAdd(
      Long accountId, String videoId, File videoFile, String signature, Long number)
      throws ApiException, TencentAdsResponseException {
    VideomakerVideocapturesAddResponse resp =
        api.videomakerVideocapturesAdd(accountId, videoId, videoFile, signature, number);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
