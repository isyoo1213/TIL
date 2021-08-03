#생성자

__init__ 
클래스 변수가 생성될 때 자동으로 호출되는 함수
클래스 변수 안에 변수를 생성할 때 사용

self
쉽게 접근하자면, 클래스로 만드는 변수에 접근할 수 있게 도와주는 파라미터.
같은 클래스로 찍어낼 때 같은 값을 가진 변수라도, 서로 다른 변수는 할당된 값이 다름

class Simpletest:    
  def __init__(self):        
  self.my_data = 100        
  print('Call init')

simple = Simpletest()
simple2 = Simpletest()
simple.my_data = 30print(simple.my_data)
print(simple2.my_data)


#self는 클래스 내부에서 클래스에서 생성한 요소들에 접근하기 위한 것
>> ** 클래스로 찍어낸 객체가 입력값을 받아올 떄 self는 입력값으로 받지 않음


#클래스에서 선언한 함수에서 변수 사용하기

class Simpletest:  
  def __init__(self):        
    self.prefix = 'You said : '        
    self.postfix = '\n'+'-'*20 + '\n'    
  def print_with_fix(self, string):        
    print(self.prefix + string + self.postfix)
simple = Simpletest()
simple.print_with_fix('hello')
