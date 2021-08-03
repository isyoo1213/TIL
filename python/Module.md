pycharm 사용 시 python file import 할 때 경로에 파일 확장자 X


** 모듈 전체를 import 할 때는, 모듈 내 특정 class 사용 시 모듈 이름을 명시해줘야함

폴더 내의 모듈을 import 할 때에는 folder_name.module_name 으로 경로 명시해야함


# __name__ 내장 변수 활용하기

모듈로 사용되는 파일에 pritn(__name__)을 추가
>> auto.py실행 시, 해당 모듈이 사용되면 모듈명 collected가 출력됨

모듈 파일 자체를 실행하면
>> __main__ 출력 
>> ** 모듈로 활용되는 것이 아니라 메인으로 실행 됨을 의미
