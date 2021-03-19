package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MenuPopup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-19T21:32:23.879104+09:00[Asia/Tokyo]")


public class MenuPopup   {
  @JsonProperty("value")
  private String value = null;

  @JsonProperty("onclick")
  private String onclick = null;

  public MenuPopup value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @Schema(example = "New", description = "")
  
  @Size(max=20)   public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public MenuPopup onclick(String onclick) {
    this.onclick = onclick;
    return this;
  }

  /**
   * Get onclick
   * @return onclick
   **/
  @Schema(example = "CreateNewDoc()", description = "")
  
  @Size(max=255)   public String getOnclick() {
    return onclick;
  }

  public void setOnclick(String onclick) {
    this.onclick = onclick;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuPopup menuPopup = (MenuPopup) o;
    return Objects.equals(this.value, menuPopup.value) &&
        Objects.equals(this.onclick, menuPopup.onclick);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, onclick);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuPopup {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    onclick: ").append(toIndentedString(onclick)).append("\n");
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
