package com.indhu.restapi.api.v1.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@ApiModel(value = "Customer List", description = "customer list")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerListDTO {

    private List<CustomerDTO> customers;
}
