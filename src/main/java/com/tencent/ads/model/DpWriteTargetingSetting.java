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

package com.tencent.ads.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 定向详细设置 */
@ApiModel(description = "定向详细设置")
public class DpWriteTargetingSetting {
  @SerializedName("age")
  private List<AgeStruct> age = null;

  @SerializedName("gender")
  private List<String> gender = null;

  @SerializedName("education")
  private List<String> education = null;

  public DpWriteTargetingSetting age(List<AgeStruct> age) {
    this.age = age;
    return this;
  }

  public DpWriteTargetingSetting addAgeItem(AgeStruct ageItem) {
    if (this.age == null) {
      this.age = new ArrayList<AgeStruct>();
    }
    this.age.add(ageItem);
    return this;
  }

  /**
   * Get age
   *
   * @return age
   */
  @ApiModelProperty(value = "")
  public List<AgeStruct> getAge() {
    return age;
  }

  public void setAge(List<AgeStruct> age) {
    this.age = age;
  }

  public DpWriteTargetingSetting gender(List<String> gender) {
    this.gender = gender;
    return this;
  }

  public DpWriteTargetingSetting addGenderItem(String genderItem) {
    if (this.gender == null) {
      this.gender = new ArrayList<String>();
    }
    this.gender.add(genderItem);
    return this;
  }

  /**
   * Get gender
   *
   * @return gender
   */
  @ApiModelProperty(value = "")
  public List<String> getGender() {
    return gender;
  }

  public void setGender(List<String> gender) {
    this.gender = gender;
  }

  public DpWriteTargetingSetting education(List<String> education) {
    this.education = education;
    return this;
  }

  public DpWriteTargetingSetting addEducationItem(String educationItem) {
    if (this.education == null) {
      this.education = new ArrayList<String>();
    }
    this.education.add(educationItem);
    return this;
  }

  /**
   * Get education
   *
   * @return education
   */
  @ApiModelProperty(value = "")
  public List<String> getEducation() {
    return education;
  }

  public void setEducation(List<String> education) {
    this.education = education;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpWriteTargetingSetting dpWriteTargetingSetting = (DpWriteTargetingSetting) o;
    return Objects.equals(this.age, dpWriteTargetingSetting.age)
        && Objects.equals(this.gender, dpWriteTargetingSetting.gender)
        && Objects.equals(this.education, dpWriteTargetingSetting.education);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, gender, education);
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
