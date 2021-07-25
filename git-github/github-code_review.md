# Code_Review

# 코드리뷰를 위한 Branch 생성
add, commit 완료한 소스코드 파일을 main branch로 merge하기 전,
main과 독립적인 branch를 통한  reviewer의 approve 과정이 필요.

내 Repo에 Reviewer가 참여하는 방식 >> Code의 Theme이나 Name

ex)
git branch test_branch : 새로운 branch 생성

git branch : branch 상태 확인

# 코드리뷰를 위한 Branch로 이동

ex)
git switch  test_branch : 새로운 branch로 옮겨가기

git branch : test_branch로 옮겨갔는지 확인하기

# Push

현재 remote에는 main branch만 존재
>> remote에 새로 생성한 test_branch를 트래킹 해주기

ex) git push -u origin test_branch

* branch를 최초로 push할 때 한번만 수행해도 됨.

* main branch에는 push한 소스코드 파일 자체가 존재하지 않고, test_branch에만.
>> 샌드박스식 개발.

# Pull Request

github에서 pull request 생성 후 리뷰를 위한 내용 작성.

* branch 이동 방향 잘 확인하기
test_branch -> main 

* 담당 리뷰어 설정하기

리뷰어 신청하기
setting > manage access > add a collaborator

# 추가작업 한 후에 Push

ex) git push origin test_branch

>> github에서 refresh하면 자동반영.
