package practice009;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ParallelProcessMain {
	// 処理対象の数
	private static int p = 5;

	    public static void main (String args[]){
	        // 処理対象数のスレッドプール
	        ExecutorService ThreadPool = Executors.newFixedThreadPool(p);
	    	// 処理対象のリスト
	        List<String> proc = new ArrayList<>();
	        for(int i = 0; i < p; i++){
	            proc.add("処理対象" + (i +1));
	        }

	        // 処理開始の時間(ミリ秒)取得
	        long startTime = System.currentTimeMillis();

	        // 処理結果受け取り用のリストを作成
	        List<Future> resultList = new ArrayList<>();

//	       try {
	        	// 処理対象をサブ処理１～３に渡して処理実行
	        	for(int i=0 ; i<p ; i++){
	        		ThreadPool.submit(new ParallelProcessSub1(proc.get(i)));
	        		resultList.add(****);  // ここにprocess()を入れたい
	        		System.out.println(proc.get(i) + "実行済み");
	        	}

/**
 *
	        }catch(ExecutionException e) {
	            e.printStackTrace();
	        }

	        // 実行結果を取得する
	        for(Future result : resultList){
	            try{
	                System.out.println(result.get());
	            }catch(Exception e){
	                e.printStackTrace();
	            }
	        }
**/

	        // 処理終了の時間(ミリ秒)取得
	        long endTime = System.currentTimeMillis();

	        // 実行時間を算出(ミリ秒)
	        System.out.println("実行時間： " + (endTime -startTime));
	    }


}

