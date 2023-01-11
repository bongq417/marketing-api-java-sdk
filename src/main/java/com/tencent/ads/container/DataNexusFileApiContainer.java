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
import com.tencent.ads.api.DataNexusFileApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.DataNexusFileAddResponse;
import com.tencent.ads.model.DataNexusFileAddResponseData;
import com.tencent.ads.model.DataNexusFileGetResponse;
import com.tencent.ads.model.DataNexusFileGetResponseData;
import com.tencent.ads.model.FileExtraInfo;
import com.tencent.ads.model.SchemeCol;
import com.tencent.ads.model.SelectScene;
import java.io.File;
import java.util.List;

public class DataNexusFileApiContainer extends ApiContainer {

  @Inject DataNexusFileApi api;

  /**
   * 上传文件
   *
   * @param accountId (required)
   * @param fileName (required)
   * @param fileDesc (required)
   * @param file (required)
   * @param schemaDefine (required)
   * @param scenes (required)
   * @param extraInfo (optional)
   * @return DataNexusFileAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public DataNexusFileAddResponseData dataNexusFileAdd(
      Long accountId,
      String fileName,
      String fileDesc,
      File file,
      List<SchemeCol> schemaDefine,
      List<SelectScene> scenes,
      FileExtraInfo extraInfo)
      throws ApiException, TencentAdsResponseException {
    DataNexusFileAddResponse resp =
        api.dataNexusFileAdd(accountId, fileName, fileDesc, file, schemaDefine, scenes, extraInfo);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 文件查看
   *
   * @param accountId (required)
   * @param fileId (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return DataNexusFileGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public DataNexusFileGetResponseData dataNexusFileGet(
      Long accountId, Long fileId, Long page, Long pageSize, List<String> fields)
      throws ApiException, TencentAdsResponseException {
    DataNexusFileGetResponse resp = api.dataNexusFileGet(accountId, fileId, page, pageSize, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}