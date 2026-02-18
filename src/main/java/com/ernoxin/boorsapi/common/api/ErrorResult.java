package com.ernoxin.boorsapi.common.api;

import java.util.List;

public record ErrorResult(
        List<String> details
) {
}
