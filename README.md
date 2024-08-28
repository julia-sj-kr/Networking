# 통신 방법 정리

## 1. 근거리 통신 방법

### 1.1 블루투스 (Bluetooth)
- **설명**: 주로 모바일 기기 간의 데이터 전송에 사용.
- **범위**: 약 10m 이내.
- **특징**: 저전력 소모.

### 1.2 Wi-Fi Direct
- **설명**: Wi-Fi를 통해 기기 간 직접 연결.
- **범위**: 일반적인 Wi-Fi 범위와 동일 (수십 미터).
- **특징**: 고속 데이터 전송 가능.

### 1.3 NFC (Near Field Communication)
- **설명**: 두 기기가 근접해야만 작동 (대개 4cm 이내).
- **용도**: 주로 결제 시스템 및 간단한 데이터 전송에 사용.

### 1.4 Zigbee
- **설명**: 저전력, 저비용 무선 네트워크.
- **용도**: 스마트 홈 기기 및 IoT 환경에서 주로 사용.
- **범위**: 약 10-100m.

### 1.5 IR (Infrared) 통신
- **설명**: 적외선 신호를 이용한 통신 방식.
- **용도**: 주로 리모컨 등에서 사용.
- **범위**: 일반적으로 1-5m.

---

## 2. 원거리 통신 방법

### 2.1 Wi-Fi
- **설명**: 무선 인터넷을 통한 데이터 전송.
- **범위**: 수십 미터에서 수백 미터.
- **특징**: 고속 인터넷 연결 가능.

### 2.2 LTE/5G
- **설명**: 모바일 통신망을 통한 데이터 전송.
- **범위**: 수 킬로미터.
- **특징**: 고속 데이터 전송 및 광범위한 연결 가능.

### 2.3 위성 통신
- **설명**: 위성을 통한 글로벌 데이터 전송.
- **특징**: 지리적 제한이 적음.
- **용도**: 전 세계 어디서나 사용 가능.

### 2.4 RFID (Radio Frequency Identification)
- **설명**: 무선 주파수를 사용한 식별 및 데이터 전송.
- **범위**: 수 미터에서 수십 미터.
- **용도**: 물품 추적 및 재고 관리 등에 사용.

### 2.5 LoRa (Long Range)
- **설명**: 저전력, 장거리 통신 기술.
- **용도**: IoT 기기에서 많이 사용.
- **범위**: 수 킬로미터.


---

## jSerialComm

jSerialComm은 자바(Java) 프로그램에서 시리얼 통신(Serial Communication)을 쉽게 다룰 수 있게 해주는 라이브러리입니다. 이 라이브러리를 사용하면 자바 프로그램에서 시리얼 포트(USB, COM 포트 등)를 통해 데이터를 송수신할 수 있습니다. 시리얼 통신은 주로 아두이노(Arduino)와 같은 마이크로컨트롤러나 다른 하드웨어 장치와의 통신에 사용됩니다.

Serial Port Communication tutorial using Java and Arduino
https://www.xanthium.in/cross-platform-serial-port-programming-tutorial-java-jdk-arduino-embedded-system-tutorial

Serial Communication with Java in 2021 
https://philstories.medium.com/the-landscape-of-serial-communication-with-java-in-2021-com-ports-c5d9741aa263

What is jSerialComm?
jSerialComm 외부 라이브러리 다운로드
[intellij]-[파일]-[프로젝트구조]-[모듈]-[종속요소]-[+]-[1.JARs or Directories]
https://fazecast.github.io/jSerialComm/?source=post_page-----c5d9741aa263--------------------------------
