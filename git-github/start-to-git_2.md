Git Bash 시작하기 (Windows)
Git과 Git Bash 설치 후, 기본적인 요소들과 사용 방법을 알아보자!

Git Bash 시작화면
Git Bash를 실행하면 내가 현재 위치한 디렉토리의 경로가 나타나며 $, %를 통해 입력 준비가 완료된 상태를 표시해준다.


~ (tild, 틸드)
틸드 표시는 로그인된 USER의 최상위 폴더를 나타내며, 권환을 획득하지 않아도 사용 가능하다.

/
운영체제가 인식할 수 있는 최상위 폴더를 나타낸다.

@
@ 왼쪽은 현재 사용 중인 USER를 나타내고,
@ 오른쪽은 현재 사용 중인 컴퓨터의 이름을 나타낸다.

Git Bash 기본 명령어
cd (Change Directory)
~(tild)로그인된 USER의 최상위 폴더로 돌아오게 된다.

ls (List files and directories)
현재 디렉토리 내의 파일들을 표시해준다.

ls -a
숨김 처리된 파일들까지 표시해준다.
숨김 처리된 파일들은 파일명 앞에 .(Dot)이 붙어있다.

cd + directory_name
현재 위치한 디렉토리 내의 특정한 디렉토리에 접근한다.

cd ../
현재 위치한 디렉토리의 한 단계 상위 디렉토리로 이동한다.

Git Bash는 상대경로를 인식한다.
mkdir + directory_name
현재 위치한 디렉토리 내부에 새로운 디렉토리를 생성한다.

touch + file_name
현재 위치한 디렉토리 내부에 새로운 파일을 생성한다.

mv + directory/file_name + new_directory
특정 디렉토리에 위치한 파일을 새로운 디렉토리로 이동한다.

mv ../server.py ./

상위 디렉토리(../)에 위치한 server.py 파일을 현재 디렉토리(./)로 이동한다.

rm + file_name
해당 파일을 삭제한다.

디렉토리가 아닌 파일만 삭제 가능하다.
공통적인 속성을 가진 파일을 삭제할 때는, *(Asterisk, 에스터리스크)를 통해 공통 속성을 묶어 사용할 수 있다.
rm *.txt
rm server.*
txt확장자를 가진 모든 파일 삭제
server의 파일명을 가진 모든 파일 삭제
cp + file_name
해당 파일을 복제한다.

mv + origin_file_name + new_file_name
해당 파일의 이름을 새로운 파일 이름으로 수정한다.

rm(Remove) 명령어를 이용해 현재 파일명의 파일을 삭제와 새로운 파일명의 파일의 생성이 동시에 이루어진다.
현재 파일명의 파일을 삭제함과 동시에, 새로운 파일명의 파일이 생성되는 디렉토리를 지정해줄 수도 있다.
rm test.py NEWDIR/hello.py

현재 디렉토리의 test.py 파일을 NEWDIR 디렉토리 하위에 hello.py의 파일명으로 생성
rm + -rf + directory
해당 디렉토리를 삭제한다.

Directory는 Object, 물리적 존재가 아니다!
Path의 개념이다.
따라서 Directory내의 모든 Object를 강제적으로 삭제해야한다. -r(Remove)f(Force)
이상으로 기본적인 Git Bash의 명령어들을 살펴보았다.

