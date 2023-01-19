package com.example;

import lombok.Value;

@SuppressWarnings("RedundantModifiersValueLombok"/*to make kotlin compiler happy*/)
@Value
public class MyValuePrivate {

    private String first;
    private String second;

}
