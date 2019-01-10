package com.wissensalt.rnd.slr.shared.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created on 1/4/19.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Getter
@Setter
public class RequestFindByNameDTO implements Serializable {
    private String name;
}
