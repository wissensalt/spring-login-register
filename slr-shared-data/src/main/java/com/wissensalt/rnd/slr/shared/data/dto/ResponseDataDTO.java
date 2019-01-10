package com.wissensalt.rnd.slr.shared.data.dto;

import lombok.*;

import java.io.Serializable;

/**
 * Created on 1/3/19.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDataDTO implements Serializable {

    private String responseCode;
    private String responseMsg;
}
