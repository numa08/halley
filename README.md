# Halley

それは流れる星のように・・・

## What Halley ?

いつだって誰だって、人は速度を求めてきた。それは、電子計算機が支配する今日でも変わらない。

データのダウンロードにしたって、煩わしい動作を人は拒むものだ。

だから僕はこのツールを作った。

Halley、そう彗星のような速度を以って、特定のデータをダウンロードするツール。それがHalley。

## How To USE ?

このツールは[conscript](https://github.com/n8han/conscript)によって実装されている。そのため、実行にはconscriptをインストールしておく必要がある。

その辺りの詳細については、[conscript - Scala で作られたソフトウェアをインストールするためのツール](http://blog.twiwt.org/e/58baf0)を参考すると速いだろう。

conscriptのインストールが完了したら、ようやくHalleyのインストールだ。

  cs numa08/halley
  
このコマンドでインストールが完了する。それでは、さっそくお目当ての画像を入手してこよう。

適当な場所に`Halleyfile`という名前のファイルを作成し、次の内容を書いてくれ。


```scala
new urls {
	add("ダウンロードしたいページのURL(例：http://g.e-hentai.org/g/344872/6533c3fb52/")
	add("複数記入することもできる")
	// //から始まる行はコメントだ
}
```


最後に`Halleyfile`のある場所で

  halley

コマンドを打ち込めば完了だ。あとは、待つだけ。
