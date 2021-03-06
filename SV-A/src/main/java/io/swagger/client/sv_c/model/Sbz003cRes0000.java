/*
 * Host-like WEB APIs with Swagger.
 * This is a practice to make host-like WEB APIs with Swagger generated code. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: akahane.yasuhiko@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.sv_c.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.sv_c.model.Sbz003cRes;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Sbz003cRes0000
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-03-18T22:57:35.042020+09:00[Asia/Tokyo]")
public class Sbz003cRes0000 extends Sbz003cRes {
  @SerializedName("resItem1")
  private String resItem1 = null;

  public Sbz003cRes0000 resItem1(String resItem1) {
    this.resItem1 = resItem1;
    return this;
  }

   /**
   * Get resItem1
   * @return resItem1
  **/
  @Schema(example = "hoge fuga hoga", required = true, description = "")
  public String getResItem1() {
    return resItem1;
  }

  public void setResItem1(String resItem1) {
    this.resItem1 = resItem1;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sbz003cRes0000 sbz003cRes0000 = (Sbz003cRes0000) o;
    return Objects.equals(this.resItem1, sbz003cRes0000.resItem1) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resItem1, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sbz003cRes0000 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    resItem1: ").append(toIndentedString(resItem1)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
