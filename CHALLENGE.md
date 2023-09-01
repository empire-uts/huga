# 2023 年度 インターンシップコーディング試験

## 課題内容 (その 1)

1. [Use this template](https://github.com/new?template_name=mobile-coding-test_2023&template_owner=cw-recruit) をクリックし、自身の GitHub にこのリポジトリをコピーしてください
1. [公式サイト](https://developer.android.com/studio/install?hl=ja) を参考に、Android Studio をインストールしてください
1. [公式チュートリアル](https://developer.android.com/codelabs/basic-android-kotlin-compose-first-app?hl=ja) を参考に、`Hello, World!` アプリを作成してください
1. 作成した `Hello, World!` アプリを、コピーしたリポジトリへアップロードしてください

## 課題内容 (その 2)

`answer.kt` というファイル名で、以下の入出力を満たす CUI プログラムを作成してください：

(※ 実装にあたって、プログラミング言語は Kotlin のみ使用可能です)

**入力：**

```sh
N

# N は 1 以上の整数
```

**出力：**

```sh
    1
   121
  12321
 1234321
1...N...1

# N 行分の出力であって、数値を足し引きしながらピラミッド上の表示となるもの
# ただし、数値は 10 で割ったあまりを用いて、常に 1 ケタであることを保証するものとする
```

作成した `answer.kt` も、同様にコピーしたリポジトリへアップロードしてください

### 入出力例 1

**入力：**

```
2
```

**出力：**

```
 1
121
```

### 入出力例 2

**入力：**

```
5
```

**出力：**

```
    1
   121
  12321
 1234321
123454321
```
