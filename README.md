# 모르는 용어 정리
 interpolator 
 -----
     애니메이션에 효과를 줄 수 있다
        - 점점 빠르게 : accelerate_interpolator
        - 점점 느리게 : decelerate_interpolator
        - 위 둘을 동시에 : accelerate_decelerate_interpolator
        - 시작위치에서 조금 뒤로 당겼다 이동 : anticipate_interpolator
        - 도착위치를 조금 지나쳤다가 도착위치로 이동 : overshoot_interpolator
        - 위 둘을 동시에 : anticipate_overshoot_interpolator
        - 도착위치에서 튕김 : bounce_interpolator
  
pivot
-----
     - pivotX : X 좌표의 중심점
     - pivotY : Y 좌표의 중심점


참고(출처)
====
  - <h6>https://grandslam.tistory.com/entry/SurfaceView-활용하기 </h6>
  - <h6>https://winmargo.tistory.com/74 </h6>
