package com.sist;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by aaa on 2016-02-29.
 *    annotation
 *         -의미 : java class 파일에 meta 정보를 기술하여
 *                 meta 정보를 프로그래밍에 활용하는 방식
 *         -용도 :
 *               - 컴파일러에게 코드 작성 문법 에러 체크하도록 정보 제공
 *                  @Override
 *               - 소프트웨어 개발 툴이 빌드. 배치시 코드를 자동 생성하게 정보 제공
 *               - 실행(Run-Time)시 특정 기능 실행하도록 정보 제공.
 *
 *         * annotation target 종료
 *               - 코드 상에서 어노테이션을 적용할 수 있는 대상.
 *               - java.lang.annotation.ElementType 열거 상수로 정의
 *                    - TYPE : class.interface.enum에서 사용 가능.
 *                    - FIELD : field에 사용 가능
 *                    - METHOD : method에 사용 가능
 *
 *         * annotation 정의 및 사용
 *               - 기본 엘리먼트 value
 *               - 사용
 *                   - 어노테이션 적용할 때 엘리먼트 이름 생략 가능
 *                   - 두개 이상의 속성을 기술할 때는 value=값 형태로 기술.
 *
 *         * annotation 유지 정책
 *               - 어노테이션 적용 코드가 유지되는 시점을 지정하는 것.
 *               - java.lang.annotation.RetentionPolicy 열거상수로 정의.
 *                  - SOURCE
 *                       - 소스상에서만 어노테이션 정보를 유지함.
 *                       - 소스 코드 분석할 때만 의미가 있음.
 *                       - 바이트 코드 파일에는 정보가 남아 있지 않음.
 *                  - CLASS
 *                       - 바이트 코드 파일까지 어노테이션 정보 유지함.
 *                       - 하지만 리플렉션을 이용해서 어노테이션 정보를 얻을 수 없음.
 *                  -
 *
 */
public @interface PrintAnnotation {
    String value() default "-";
    int number() default 15;
}
