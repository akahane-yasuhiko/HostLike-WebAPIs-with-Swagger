package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sbz002bReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-19T21:32:23.879104+09:00[Asia/Tokyo]")


public class Sbz002bReq   {
  @JsonProperty("userid")
  private String userid = null;

  public Sbz002bReq userid(String userid) {
    this.userid = userid;
    return this;
  }

  /**
   * Get userid
   * @return userid
   **/
  @Schema(example = "fugaid", required = true, description = "")
      @NotNull

  @Size(min=4,max=20)   public String getUserid() {
    return userid;
  }

  public void setUserid(String userid) {
    this.userid = userid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sbz002bReq sbz002bReq = (Sbz002bReq) o;
    return Objects.equals(this.userid, sbz002bReq.userid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sbz002bReq {\n");
    
    sb.append("    userid: ").append(toIndentedString(userid)).append("\n");
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
