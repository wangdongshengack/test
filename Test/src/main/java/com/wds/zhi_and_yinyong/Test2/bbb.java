package com.wds.zhi_and_yinyong.Test2;

import java.util.Objects;

public class bbb {
    private Integer id;

    public bbb(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        bbb bbb = (bbb) o;
        return Objects.equals(id, bbb.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
