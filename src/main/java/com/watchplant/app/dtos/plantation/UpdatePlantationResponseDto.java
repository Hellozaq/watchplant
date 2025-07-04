package com.watchplant.app.dtos.plantation;

import com.watchplant.app.entities.Plantation;
import java.util.UUID;

/**
 * DTO for the response of updating a plantation.
 * Contains the updated details of the plantation.
 */
public class UpdatePlantationResponseDto {

  private UUID id;
  private String name;
  private Double sizeArea;

  /**
   * Constructor for UpdatePlantationResponseDto.
   *
   * @param plantation The updated plantation.
   */
  public UpdatePlantationResponseDto(Plantation plantation) {
    this.id = plantation.getId();
    this.name = plantation.getName();
    this.sizeArea = plantation.getSizeArea();
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Double getSizeArea() {
    return sizeArea;
  }
}