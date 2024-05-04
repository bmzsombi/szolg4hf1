package soi;

import streaming.SingleMovieGrpc;
import streaming.SingleMovieOuterClass.GetFramesReply;
import streaming.SingleMovieOuterClass.GetFramesRequest;
import streaming.SingleMovieOuterClass.GetLengthReply;
import streaming.SingleMovieOuterClass.GetLengthRequest;
import streaming.SingleMovieOuterClass.GetTitleReply;
import streaming.SingleMovieOuterClass.GetTitleRequest;

import java.util.ArrayList;

import java.math.BigDecimal;
import java.math.MathContext;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class MoviePiBackendService extends SingleMovieGrpc.SingleMovieImplBase {

	@Override
	public void getTitle(GetTitleRequest request, StreamObserver<GetTitleReply> responseObserver) {
		var reply = GetTitleReply.newBuilder().setTitle("pi").build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}
	
	@Override
	public void getLength(GetLengthRequest request, StreamObserver<GetLengthReply> responseObserver) {
		var reply = GetLengthReply.newBuilder().setLength(1000).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}
	
	@Override
	public void getFrames(GetFramesRequest request, StreamObserver<GetFramesReply> responseObserver) {
		ArrayList<Integer> list = new ArrayList<>();
		
		MathContext mc = new MathContext(1000);
		BigDecimal pii = new BigDecimal(Math.PI, mc);
		String pi = pii.toString();
		
		for (int i = 0; i < pi.length(); i++) {
		    Character c = pi.charAt(i);
		    String s = c.toString();
		    list.add(Integer.parseInt(s));
		    System.out.print(c);
		}
		
		var reply = GetFramesReply.newBuilder().addAllFrame(list).build();
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}
	
}
