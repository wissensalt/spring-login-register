package com.wissensalt.rnd.slr.web.feign;

import com.wissensalt.rnd.slr.shared.data.dto.RequestFindByNameDTO;
import com.wissensalt.rnd.slr.shared.data.dto.RequestLoginDTO;
import com.wissensalt.rnd.slr.shared.data.dto.ResponsePrincipalDTO;
import com.wissensalt.rnd.slr.shared.data.dto.ResponseUserDTO;
import feign.Headers;
import feign.RequestLine;

/**
 * Created on 1/4/19.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface ILoginClient {

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @RequestLine("POST /auth/principal")
    ResponsePrincipalDTO login(RequestLoginDTO p_RequestLoginDTO);

    @Headers({"Accept: application/json", "Content-Type: application/json"})
    @RequestLine("POST /auth/findUser")
    ResponseUserDTO findUser(RequestFindByNameDTO p_RequestFindByNameDTO);
}
