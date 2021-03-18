package com.example.demo;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 부동 소수점 ISSUE로 BigDecimal을 사용했습니다.
 * BigDecimal은 java version 1.5이상부터 사용 가능합니다.
 * N은 정수만 가능합니다.
 */
public class Main {
    public static void main(String[] args) {

        BigDecimal C = BigDecimal.valueOf(1);   // 1 대신에 C 값을 넣어주세요
        BigDecimal R = BigDecimal.valueOf(2);   // 2 대신에 R 값을 넣어주세요
        BigDecimal N = BigDecimal.valueOf(3);   // 3 대신에 N 값을 넣어주세요
        BigDecimal F = BigDecimal.valueOf(4);   // 4 대신에 F 값을 넣어주세요

        BigDecimal result = P(C, R, N, F);

        System.out.println(result);

    }

    private static BigDecimal P(BigDecimal C, BigDecimal R, BigDecimal N, BigDecimal F) {

        BigDecimal result = BigDecimal.valueOf(0);

        for (int i = 1; i <= N.intValue(); i++) {

            BigDecimal pow = R.add(BigDecimal.valueOf(1)).pow(i);

            // 계산시 소수점 이하 금액은 절상처리되었습니다.
            result = result.add(C.divide(pow, RoundingMode.CEILING));

        }

        // 계산시 소수점 이하 금액은 절상처리되었습니다.
        result = result.add(F.divide(R.add(BigDecimal.valueOf(1)).pow(N.intValue()), RoundingMode.CEILING));

        return result;
    }
}
