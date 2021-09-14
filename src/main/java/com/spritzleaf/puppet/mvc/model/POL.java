package com.spritzleaf.puppet.mvc.model;

import com.spritzleaf.puppet.mvc.constants.POLStates;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class POL {

    @Builder.Default
    private String company = "PanziCompany";

    @Builder.Default
    private POLStates stato = POLStates.IN_ATTESA;

    private String polCode;

    @Builder.Default
    private String causale = "pagamento prima rata";

    @Builder.Default
    private Long amount = 1200L;


}
