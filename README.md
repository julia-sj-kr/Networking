# :sparkles: 통신 방법 종류

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

### :books:jSerialComm

jSerialComm은 자바(Java) 프로그램에서 시리얼 통신(Serial Communication)을 쉽게 다룰 수 있게 해주는 라이브러리입니다. 이 라이브러리를 사용하면 자바 프로그램에서 시리얼 포트(USB, COM 포트 등)를 통해 데이터를 송수신할 수 있습니다. 시리얼 통신은 주로 아두이노(Arduino)와 같은 마이크로컨트롤러나 다른 하드웨어 장치와의 통신에 사용됩니다.

Serial Port Communication tutorial using Java and Arduino
https://www.xanthium.in/cross-platform-serial-port-programming-tutorial-java-jdk-arduino-embedded-system-tutorial

Serial Communication with Java in 2021 
https://philstories.medium.com/the-landscape-of-serial-communication-with-java-in-2021-com-ports-c5d9741aa263

What is jSerialComm?
jSerialComm 외부 라이브러리 다운로드
[intellij]-[파일]-[프로젝트구조]-[모듈]-[종속요소]-[+]-[1.JARs or Directories]
https://fazecast.github.io/jSerialComm/?source=post_page-----c5d9741aa263--------------------------------

---
# :sparkles: 프로토콜의 역할

통신의 기초가 되는 중요한 개념으로 컴퓨터와 네트워크 장치들이 서로 데이터를 주고받을 때, 이 데이터가 어떤 형식으로 보내지고, 어떤 순서로 처리되어야 하는지, 오류가 발생하면 어떻게 대응할지 등을 정해 놓은 것이 프로토콜입니다. 이 규칙을 따르기 때문에 서로 다른 기기와 시스템이 문제없이 통신할 수 있습니다.

프로토콜의 예<br>
:white_small_square:HTTP (Hypertext Transfer Protocol): 웹 브라우저와 웹 서버 간의 통신을 위한 프로토콜입니다. 예를 들어, 여러분이 웹사이트에 접속할 때 이 프로토콜이 사용됩니다.<br>
:white_small_square:TCP/IP (Transmission Control Protocol/Internet Protocol): 인터넷에서 데이터를 주고받는 기본 프로토콜입니다. TCP는 데이터를 안정적으로 전송하도록 도와주고, IP는 데이터가 올바른 주소로 가도록 합니다.<br>
:white_small_square:FTP (File Transfer Protocol): 컴퓨터 간 파일을 주고받을 때 사용하는 프로토콜입니다.<br>
:white_small_square:SIP (Session Initiation Protocol): 음성이나 영상 통화 같은 실시간 통신을 시작하고 관리하기 위한 프로토콜입니다.<br>
:white_small_square:비유를 통해 이해하기<br>
프로토콜을 사람 사이의 언어로 비유할 수 있습니다. 예를 들어, 한국어를 사용하는 사람끼리 대화를 할 때, 같은 언어 규칙(문법과 어휘)을 사용해야 서로 이해할 수 있듯이, 네트워크 통신에서도 서로 다른 장치들이 같은 프로토콜을 사용해야 원활하게 데이터를 주고받을 수 있습니다.

---
# :sparkles: 네트워크 프로토콜 계층 모델

네트워크에서 데이터를 주고받기 위해 여러 계층(layer)으로 나뉜 프로토콜이 존재합니다. 이 계층 구조를 OSI 모델 또는 TCP/IP 모델이라고 합니다. 각 계층은 특정한 역할을 담당하며, 상위 계층의 데이터는 하위 계층을 통해 물리적으로 전송됩니다.

:white_small_square:애플리케이션 계층 (Application Layer):<br>
사용자에게 직접 서비스를 제공하는 계층입니다. 웹 브라우징, 이메일, 파일 전송 등이 여기 속합니다.<br>
예: FTP, HTTP, SMTP, DNS, SIP 등.

:white_small_square:전송 계층 (Transport Layer):<br>
데이터 전송을 책임지는 계층입니다. 이 계층에서는 데이터의 신뢰성, 흐름 제어, 오류 복구를 담당합니다.<br>
예: TCP(Transmission Control Protocol), UDP(User Datagram Protocol).

:white_small_square:네트워크 계층 (Network Layer):<br>
데이터를 목적지까지 전송하는 경로를 결정하는 계층입니다. IP 주소를 사용하여 데이터 패킷을 올바른 주소로 전달합니다.<br>
예: IP(Internet Protocol).

:white_small_square:링크 계층 (Link Layer):<br>
동일 네트워크 내에서 데이터를 전송하는 물리적 연결을 담당합니다. 실제로 데이터를 전송하는 하드웨어적인 계층입니다.<br>
예: 이더넷, Wi-Fi.

---
# :sparkles: 통화기능(SIP 프로토콜)

SIP(Session Initiation Protocol)는 VoIP 통신에서 사용되는 프로토콜로, 음성 통화를 시작하고 관리하는 역할을 합니다.<br>

SIP 서버<br>
:white_small_square: miniSIP 다운로드 링크: https://www.myvoipapp.com/<br>

SIP 클라이언트<br>
:white_small_square: MicroSIP 다운로드 링크: https://www.microsip.org/<br>
:white_small_square: 안드로이드 SIP 다운로드 링크: https://www.mizu-voip.com/Software/SIPSDK/AndroidSIPSDK.aspx

자바 전화기, 안드로이드 전화기, 아이폰 전화기 등 다양한 플랫폼에서 VoIP 통신을 위한 전화기 앱을 다운로드하고 설치할 수 있습니다.<br>
이 앱들은 각각의 운영체제에서 SIP 서버와 연결하여 음성 통신을 가능하게 합니다.
