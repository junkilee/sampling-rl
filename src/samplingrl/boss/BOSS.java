package samplingrl.boss;

import burlap.behavior.singleagent.EpisodeAnalysis;
import burlap.behavior.singleagent.MDPSolver;
import burlap.behavior.singleagent.learning.LearningAgent;
import burlap.oomdp.singleagent.environment.Environment;

/**
 * A class for the implementation of a reinforcement learning algorithm specified in the below paper
 * 
 * A Bayesian Sampling Approach to Exploration in Reinforcement Learning
 * John Asmuth, Lihong Li, Michael L. Littman, Ali Nouri, and David Wingate
 * UAI 2009
 * 
 * @author Jun Ki Lee
 */
public class BOSS extends MDPSolver implements LearningAgent {

	@Override
	public EpisodeAnalysis runLearningEpisode(Environment env) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EpisodeAnalysis runLearningEpisode(Environment env, int maxSteps) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void resetSolver() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		
	}

}
