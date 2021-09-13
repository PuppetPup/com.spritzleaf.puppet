package com.spritzleaf.puppet.mvc.repository;

import com.spritzleaf.puppet.mvc.model.Profilo;

public interface ProfiloDao {
    Profilo getProfiloByUsername(String username);
}
