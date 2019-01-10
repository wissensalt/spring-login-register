package com.wissensalt.rnd.slr.web.feign;

import com.wissensalt.rnd.slr.shared.data.dto.RequestRegisterDTO;
import com.wissensalt.rnd.slr.shared.data.dto.ResponseDataDTO;
import feign.Headers;
import feign.RequestLine;

/**
 * Created on 1/10/19.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface IRegisterClient {

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @RequestLine("POST /registration/register")
    ResponseDataDTO register(RequestRegisterDTO p_RequestRegisterDTO);
}
