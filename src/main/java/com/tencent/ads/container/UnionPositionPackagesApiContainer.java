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
import com.tencent.ads.api.UnionPositionPackagesApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.UnionPositionPackagesAddRequest;
import com.tencent.ads.model.UnionPositionPackagesAddResponse;
import com.tencent.ads.model.UnionPositionPackagesAddResponseData;
import com.tencent.ads.model.UnionPositionPackagesDeleteRequest;
import com.tencent.ads.model.UnionPositionPackagesDeleteResponse;
import com.tencent.ads.model.UnionPositionPackagesGetResponse;
import com.tencent.ads.model.UnionPositionPackagesGetResponseData;
import com.tencent.ads.model.UnionPositionPackagesUpdateRequest;
import com.tencent.ads.model.UnionPositionPackagesUpdateResponse;
import com.tencent.ads.model.UnionPositionPackagesUpdateResponseData;
import java.util.List;

public class UnionPositionPackagesApiContainer extends ApiContainer {

  @Inject UnionPositionPackagesApi api;

  /**
   * 联盟流量包模块
   *
   * @param data (required)
   * @return UnionPositionPackagesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public UnionPositionPackagesAddResponseData unionPositionPackagesAdd(
      UnionPositionPackagesAddRequest data) throws ApiException, TencentAdsResponseException {
    UnionPositionPackagesAddResponse resp = api.unionPositionPackagesAdd(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 联盟流量包删除接口
   *
   * @param data (required)
   * @return UnionPositionPackagesDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public UnionPositionPackagesDeleteResponse unionPositionPackagesDelete(
      UnionPositionPackagesDeleteRequest data) throws ApiException, TencentAdsResponseException {
    UnionPositionPackagesDeleteResponse resp = api.unionPositionPackagesDelete(data);
    handleResponse(gson.toJson(resp));

    return resp;
  }

  /**
   * 联盟流量包获取接口
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return UnionPositionPackagesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public UnionPositionPackagesGetResponseData unionPositionPackagesGet(
      Long accountId,
      List<FilteringStruct> filtering,
      Long page,
      Long pageSize,
      List<String> fields)
      throws ApiException, TencentAdsResponseException {
    UnionPositionPackagesGetResponse resp =
        api.unionPositionPackagesGet(accountId, filtering, page, pageSize, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }

  /**
   * 联盟流量包模块
   *
   * @param data (required)
   * @return UnionPositionPackagesUpdateResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public UnionPositionPackagesUpdateResponseData unionPositionPackagesUpdate(
      UnionPositionPackagesUpdateRequest data) throws ApiException, TencentAdsResponseException {
    UnionPositionPackagesUpdateResponse resp = api.unionPositionPackagesUpdate(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
