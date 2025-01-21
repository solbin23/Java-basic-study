# Java basic study
- 멤버 변수(Member Variable): 이 변수들은 특정 클래스에 소속된 멤버이기 때문에 이렇게 부름
- 필드(Field): 데이터 항목을 가르키는 전통적인 용어. 데이터베이스, 엑셀 등에서 데이터 각각의 항목을 필드라 함
- 자바에서 멤버 변수, 필드는 같은 뜻임, 클래스에 소속된 변수를 뜻함

#### 클래스와 사용자 정의 타입

- 타입은 데이터의 종류나 형태를 나타낸다.
- ```int```라고 하면 정수 타입, ```String```이라고 하면 문자 타입니다.
- 사용자가 직접 정의하는 사용자 정의 타입을 만드려면 설계도가 필요, 이 설계도가 바로 **클래스**
- 설계도인 클래스를 사용해서 **실제 메모리에 만들어진 실체를 객체 또는 인스턴스**라 한다.
- 클래스를 통해 사용자가 원하는 종류의 데이터 타입을 마음껏 정의할 수 있음

![객체](/src/img/variable1.png)

- Student student1
  - Student 타입을 받을 수 있는 변수를 선언
  - int는 정수, String은 문자를 담을 수 있듯 Student는 Student 타입의 객체(인스턴스)를 받을 수 있음

![객체2](/src/img/variable2.png)

- 객체를 사용하려면 먼저 설계도인 클래스를 기반으로 인스턴스를 생성해야 한다.
- new Student(): new는 새로 생성한다는 뜻이다. new Student()는 Student 클래스 정보를 기반으로 새로운 객체를 생성하라는 뜻이다.
  - 이렇게 메모리에 실제 Student 인스턴스를 생성한다.
- 객체를 생성할 때는 new 클래스명()을 사용하면 된다.
- Student 클래스는 ```String name, int age, int grade``` 멤버 변수를 가지고 있다. 이 변수를 사용하는데 필요한 메모리 공간도 함께 확보한다.

![참조값 보관](/src/img/variable3.png)

- 객체를 생성하면 자바는 메모리 어딘가에 있는 이 객체에 접근할 수 있는 참조값(주소)(x001)을 반환한다.
  - 여기서 x001 이라고 표현한 것이 참조값이다.
- new 키워드를 통해 객체가 생성되고 나면 참조값을 반환한다. 앞서 선언한 변수인 student1에 생성된 객체의 참조값(x001)을 보관한다.
- student1 변수는 이제 메모리에 존재하는 실제 Student 객체(인스턴스)의 참조값을 가지고 있다.
  - student1 변수는 방금 만든 객체에 접근할 수 있는 참조값을 가지고 있다. 따라서 이 변수를 통해 객체를 접근(참조)할 수 있다.
    - 쉽게 말해 student1 변수를 통해 메모리에 있는 실제 객체를 접근하고 사용할 수 있다.

**참조값을 변수에 보관해야 하는 이유**

객체를 생성하는 new Student() 코드 자체에는 아무런 이름이 없다. 이 코드는 단순히 Student 클래스를 기반으로 메모리에 실제 객체를 만드는 것이다.

따라서 생성한 객체에 접근할 수 있는 방법이 필요하다.

이런 이유로 객체를 생성할 때 반환되는 참조값을 어딘가에 보관해두어야 한다.

앞서 Student student1 변수에 참조값(x001)을 저장해두었으므로 저장한 참조값(x001)을 통해서 실제 메모리에 존재하는 객체에 접근할 수 있다.

```
Student student1 = new Student(); //1. Student 객체 생성
Student student1 = x001; //2. new Student()의 결과로 x001 참조값 반환
student1 = x001; //3. 최종 결과
```
---

#### 객체에 값 대입

객체가 가지고 있는 멤버 변수에 값을 대입하려면 먼저 객체에 접근해야 한다.

객체에 접근하려면 ```.``` 키워드를 사용하면 된다.

이 키워드는 변수(student1)에 들어있는 참조값(x001)을 읽어서 메모리에 존재하는 객체에 접근한다.

```
student1.name = "학생1" //1.student1 객체의 name 멤버 변수에 값 대입
x001.name = "학생1" //2.변수에 있는 참조값을 통해 실제 객체에 접근, 해당 객체의 name 멤버 변수에 값 대입
```
student1. 이라고 하면 student1 변수가 가지고 있는 참조값을 통해 실체 객체에 접근한다.

student1은 x001이라는 참조값을 가지고 있으므로 x001 위치에 있는 Student 객체에 접근한다.

```student1.name="학생1"``` **코드 실행 전**

![Dot](/src/img/variableDot.png)

```student1.name="학생1"``` **코드 실행 후**

![Dot2](/src/img/variableDot2.png)
+ student1.name 코드를 통해 .(dot)키워드가 사용됐다. student1 변수가 가지고 있는 참조값을 통해 실제 객체에 접근한다.
+ x001.name = "학생1" : x001 객체가 있는 곳의 name 멤버 변수에 "학생1" 데이터가 저장된다.

#### 객체 값 읽기

![read](/src/img/readVariable.png)

![read2](/src/img/readVariable2.png)

### 기본형 VS 참조형

변수의 데이터 타입을 가장 크게 보면 기본형과 참조형으로 분류할 수 있다.

사용하는 값을 변수에 직접 넣을 수 있는 기본형, 그리고 객체가 저장된 메모리의 위치를 가르키는 참조값을 넣을 수 있는 참조형으로 분류할 수 있다.

+ 기본형(Primitive Type) : int, long, double, boolean 처럼 변수에 사용할 값을 직접 넣을 수 있는 데이터 타입을 기본형이라 한다.
+ 참조형(Reference Type) : Student student1, int[] students 와 같이 데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입을 참조형이라 한다.
  + 참조형은 객체 또는 배열에 사용된다.

기본 변수에는 직접 사용할 수 있는 값이 들어있지만 참조형 변수에는 위치(참조값)가 들어가 있다.

참조형 변수를 통해서 뭔가 하려면 결국 참조값을 통해 해당 위치로 이동해야 한다.

**기본형 vs 참조형**

+ 기본형은 숫자 10,20과 같이 실제 사용하는 값을 변수에 담을 수 있다. 그래서 해당 값을 바로 사용할 수 있다.
+ 참조형은 실제 사용하는 값을 변수에 담는 것이 아니다. 이름 그대로 실제 객체의 위치(참조, 주소)를 저장한다. 참조형에는 객체와 배열이 있다.
  + 객체는 . 을 통해서 메모리 상에 생성된 객체를 찾아가야 사용할 수 있다.
  + 배열은 [] 를 통해서 메모리 상에 생성된 배열을 찾아가야 사용할 수 있다.

**기본형 vs 참조형 - 계산**

+ 기본형은 들어있는 값을 그대로 계산에 사용할 수 있다.
  + ex)더하고 빼고, 사용하고 등등(숫자같은 것들은 바로 계산할 수 있다.)
+ 참조형은 들어있는 참조값을 그대로 사용할 수 없다. 주소지만 가지고는 할 수 있는데 없음. 주소지에 가야 실체가 있다.
  + ex)더하고 빼고 사용하지 못함, 참조값만 가지고는 계산 할 수 있는 것이 없음

**기본형은 연산이 가능**
```
int a = 10, b = 20;
int sum = a + b;
```
**참조형은 연산 불가능**
```
Student s1 = new Student();
Student s2 = new Student();
s1 + s2 //오류 발생
```
. 을 통해 객체의 기본형 멤버 변수에 접근한 경우 연산 할 수 있다.
```
Student s1 = new Student();
s1.grade = 100;
Student s2 = new Student();
s2.grade = 90;
int sum = s1.grade + s2.grade //연산 가능
```

#### 변수 대입

**자바는 항상 변수의 값을 복사해서 대입한다.**

자바에서 변수에 값을 대입하는 것은 변수에 들어 있는 값을 복사해서 대입하는 것이다.

기본형, 참조형 모두 항상 변수에 있는 값을 복사해서 대입한다.

기본형이면 변수에 들어 있는 실제 사용한느 값을 복사해서 대입하고, 참조형이면 변수에 들어 있는 참조값을 복사해서 대입한다.

**기본형 대입**
```
int a = 10;
int b = a;
```

**참조형 대입**
```
Student s1 = new Student();
Student s2 = s1;
```
기본형은 변수에 값을 대입하더라도 실제 사용하는 값이 변수에 바로 들어있기 때문에 해당 값만 복사해서 대입한다고 생각하면 쉽게 이해할 수 있다.

그런데 참조형의 경우 실제 사용하는 객체가 아니라 객체의 위치를 가르키는 참조값만 복사된다.

쉽게말해 실제 건물이 복사가 되는 것이 아니라 건물의 위치인 주소만 복사되는 것이다. 따라서 같은 건물을 찾아갈 수 있는 방법이 하나 늘어날 뿐이다.

#### 메서드 호출

자바에서 변수에 값을 대입하는 것은 변수에 들어 있는 값을 복사해서 대입하는 것

기본형, 참조형 모두 항상 변수에 있는 값을 복사해서 대입

기본형이면 변수에 들어 있는 실제 사용하는 값을 복사해서 대입하고

참조형이면 변수에 들어 있는 참조값을 복사해서 대입함

메서드 호출도 마찬가지

메서드를 호출할 때 사용하는 매개변수(파라미터)도 결국 변수일 뿐

따라서 메서드를 호출할 때 매개변수에 값을 전달하는 것도 앞서 설명한 내용과 같이 값을 복사해서 전달

**기본형과 참조형의 메서드 호출**

자바에서 메서드의 매개변수(파라미터)는 항상 값에 의해 전달된다. 그러나 이 값이 실제 값이냐, 참조(메모리 주소)값이냐에 따라 동작이 달라진다.
+ **기본형**:메서드로 기본형 데이터를 전달하면, 해당 값이 복사되어 전달된다. 
  + 메서드 내부에서 파라미터의 값을 변경해도, 호출자의 변수 값에는 영향이 없다.
+ **참조형**:메서드로 참조형 데이터를 전달하면, 참조값이 복사되어 전달된다.
  + 메서드 내부에서 파라미터로 전달된 객체의 멤버 변수를 변경하면, 호출자의 객체도 변경된다.

---

### 변수와 초기화

**변수의 종류**
- 멤버변수(필드) : 클래스에 선언
- 지역 변수 : 메서드에 선언, 매개변수도 지역 변수의 한 종류

**멤버 변수, 필드 예시**
```
public class Student {
    String name;
    int age;
    int grade;
}
```
name,age,grade는 멤버 변수

**지역 변수 예시**
```
public class ClassStart3{
  public static void main(String[] args){
      Student student1;
      student1 = new Student();
      Student student2 = new Student();
  }
}
```
student1, student2 는 지역 변수

**변수의 값 초기화**
- 멤버 변수 : 자동 초기화
  - 인스턴스의 멤버 변수는 인스턴스를 생성할 때 자동으로 초기화된다.
  - 숫자(int) = 0 , boolean = false, 참조형 = null
- 지역 변수 : 수동 초기화
  - 지역 변수는 항상 직접 초기화해야 한다.

