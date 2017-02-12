package com.github.angle.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lenovo on 2016/11/26.
 */
@Getter
@Setter
public class User implements Serializable {
    private String password;
    private boolean activated = false;
    private Set<Authority> authorities = new HashSet<>();
}
