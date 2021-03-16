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
import com.tencent.ads.api.BusinessMdmAccountRelationsApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.BusinessMdmAccountRelationsGetResponse;
import com.tencent.ads.model.BusinessMdmAccountRelationsGetResponseData;
import java.util.List;

public class BusinessMdmAccountRelationsApiContainer extends ApiContainer {

  @Inject BusinessMdmAccountRelationsApi api;

  /**
   * 查询商务管家或同主体下广告主信息
   *
   * @param accountId (required)
   * @param relationType (required)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return BusinessMdmAccountRelationsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public BusinessMdmAccountRelationsGetResponseData businessMdmAccountRelationsGet(
      Long accountId, String relationType, Long page, Long pageSize, List<String> fields)
      throws ApiException, TencentAdsResponseException {
    BusinessMdmAccountRelationsGetResponse resp =
        api.businessMdmAccountRelationsGet(accountId, relationType, page, pageSize, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}