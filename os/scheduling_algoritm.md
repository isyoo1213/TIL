# 스케쥴링 알고리즘

# 프로세스(process) 란?
실행 중인 프로그램은 프로세스라고 함
프로세스 : 메모리에 올려져서, 실행 중인 프로그램 by 폰 노이만 구조
코디 이미지(바이너리) : 실행파일, ex) ELF format

프로세스라는 용어는 작업, task, job 이라는 용어와 혼용


# 응용 프로그램 =! 프로세스

응용 프로그램은 여러 개의 프로세스로 이루어질 수 있음

하나의 응용 프로그램은 여러 개의 프로세스(프로그램)가 상호작용을 하면서 실행될 수 있음

간단한 C/C++ 프로그램을 만든다면 -> 하나의 프로세스
여러 프로그램을 만들어서 서로 통신하면서 프로그램을 작성할 수도 있음(IPC 기법)


# 스케쥴러와 프로세스

프로세스의 실행을 관리하는 것은 '스케쥴러'

# 스케쥴링 알고리즘

어느 순서대로 프로세스를 실행 시킬지 관리하는 것

목표 
시분할 시스템 예 : 프로세스 응답 시간을 가능한 짧게
멀티 프로그래밍 : CPU 활용도를 최대로 높여서 프로세스를 빠르게 실행


# FIFO 스케쥴러

가정 - 프로세스가 저장매체를 읽거나 프린팅을 하는 작업 없이, 쭉 CPU를 처음부터 끝까지 사용한다

가장 간단한 스케쥴러 ( 배치 처리 시스템과 유사해 스케쥴러로 활용되었음 )

queue >> CPU에 1, 2, 3 순서로 실행요청을 하고 사라짐
(오른쪽 끝이 queue에 가장 먼저 쌓인 프로세스)
CPU - 1, (2, 2, 2), 3 순서로 실행 ( 초단위로 나눴다고 한다면 )

FCFS ( First Come Firtst Served ) 스케쥴러

준비된 큐가 프로세서(CPU)로 넘겨짐



# 최단 작업 우선 ( Shortest Job First ) 스케쥴러

가장 프로세스 실행시간이 짧은 프로세스부터 먼저 실행시키는 알고리즘



응답시간이 짧아질 수 있다.
SJF같은 경우는 실제로 실행시간일 알아야한다는 이상적인 조건이 있음

# RealTime OS ( RTOS ) 
응용 프로그램 실시간 성능 보장을 목표로 하는 OS
정확하게 프로그램 시작, 완료 시간을 보장
시간에 민감한 프로그램들이 동작하는 환경에서 사용
공장 공정에 사용되기도 함
Hardware RTOS, Software RTOS 등등이 하위로 구성되기도

# General Purpose OS ( GPOS )
프로세스 실행 시간에 민감하지 않고, 일반적인 목적으로 사용되는 OS
ex) Windows, Linux 등


# 우선순위 기반 스케쥴러

Priority-Based 스케쥴러

정적 우선순위 - 프로세스마다 우선순위를 미리 지정
동적 우선순위 - 스케쥴러가 상황에 따라 우선순위를 동적으로 변경

정적 우선순위 스케쥴러의 예
( 우선순위가 높을수록 숫자가 높다고 가정)





# Round Robin 스케쥴러


CPU에 올라간 프로세스가 일정시간이 지나면 멈추고 준비된 큐에 내려서 대기 후 다시 작업

시분할 시스템을 가정하고 있음