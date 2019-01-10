package com.wissensalt.rnd.slr.shared.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created on 1/10/19.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class AuthorityDTO implements Serializable {

    private String authority;
}
