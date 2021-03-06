
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.io.IOException {

		ArrayList<EZgui> window = new ArrayList<EZgui>();

		EZ.setFrameRateASAP(true);

		// int used to make sure the class spot is not empty in the text file
		int emptyCount = 0;
		// number of days in a week
		int weekLength = 5;
		// 144 10 minute sections in a day
		int time = 144;
		// checks to see if two classes overlap in time
		boolean overlap = false;
		// the possible classes will be entered into classRoster.txt
		Scanner scanner = new Scanner(new FileReader("src//classRoster2017Spring.txt"));
		int[] numberOfClasses = new int[10];
		for (int i = 0; i < 10; i++) {
			numberOfClasses[i] = 10;
		}

		int[][] week = new int[5][148];
		for (int i = 0; i < weekLength; i++) {
			for (int j = 0; j < time; j++) {
				week[i][j] = 0;
			}
		}

		ClassOption[][] list = new ClassOption[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				list[i][j] = new ClassOption(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
						scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
						scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
						scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(),
						scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (emptyCount == 0) {
					numberOfClasses[i]--;
				}
				emptyCount = 0;
				for (int k = 0; k < weekLength; k++) {
					for (int l = 0; l < time; l++) {
						emptyCount += list[i][j].ls(k, l);
					}
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(numberOfClasses[i]);
		}
		for (int a = 0; a < numberOfClasses[0]; a++) {
			for (int k = 0; k < weekLength; k++) {
				for (int l = 0; l < time; l++) {
					week[k][l] += list[0][a].ls(k, l);
				}
			}
			for (int b = -1; b < numberOfClasses[1]; b++) {
				if (numberOfClasses[1] > 0) {
					if (b == -1) {
						b = 0;
					}
					for (int k = 0; k < weekLength; k++) {
						for (int l = 0; l < time; l++) {
							week[k][l] += list[1][b].ls(k, l);
						}
					}
				}
				for (int c = -1; c < numberOfClasses[2]; c++) {
					if (numberOfClasses[2] > 0) {
						if (c == -1) {
							c = 0;
						}
						for (int k = 0; k < weekLength; k++) {
							for (int l = 0; l < time; l++) {
								week[k][l] += list[2][c].ls(k, l);
							}
						}
					}
					for (int d = -1; d < numberOfClasses[3]; d++) {
						if (numberOfClasses[3] > 0) {
							if (d == -1) {
								d = 0;
							}
							for (int k = 0; k < weekLength; k++) {
								for (int l = 0; l < time; l++) {
									week[k][l] += list[3][d].ls(k, l);
								}
							}
						}
						for (int e = -1; e < numberOfClasses[4]; e++) {
							if (numberOfClasses[4] > 0) {
								if (e == -1) {
									e = 0;
								}
								for (int k = 0; k < weekLength; k++) {
									for (int l = 0; l < time; l++) {
										week[k][l] += list[4][e].ls(k, l);
									}
								}
							}
							for (int f = -1; f < numberOfClasses[5]; f++) {
								if (numberOfClasses[5] > 0) {
									if (f == -1) {
										f = 0;
									}
									for (int k = 0; k < weekLength; k++) {
										for (int l = 0; l < time; l++) {
											week[k][l] += list[5][f].ls(k, l);
										}
									}
								}
								for (int g = -1; g < numberOfClasses[6]; g++) {
									if (numberOfClasses[6] > 0) {
										if (g == -1) {
											g = 0;
										}
										for (int k = 0; k < weekLength; k++) {
											for (int l = 0; l < time; l++) {
												week[k][l] += list[6][g].ls(k, l);
											}
										}
									}
									for (int h = -1; h < numberOfClasses[7]; h++) {
										if (numberOfClasses[7] > 0) {
											if (h == -1) {
												h = 0;
											}
											for (int k = 0; k < weekLength; k++) {
												for (int l = 0; l < time; l++) {
													week[k][l] += list[7][h].ls(k, l);
												}
											}
										}
										for (int i = -1; i < numberOfClasses[8]; i++) {
											if (numberOfClasses[8] > 0) {
												if (i == -1) {
													i = 0;
												}
												for (int k = 0; k < weekLength; k++) {
													for (int l = 0; l < time; l++) {
														week[k][l] += list[8][i].ls(k, l);
													}
												}
											}
											for (int j = -1; j < numberOfClasses[9]; j++) {
												if (numberOfClasses[9] > 0) {
													if (j == -1) {
														j = 0;
													}
													for (int k = 0; k < weekLength; k++) {
														for (int l = 0; l < time; l++) {
															week[k][l] += list[9][j].ls(k, l);
														}
													}
												}
												for (int k = 0; k < weekLength; k++) {
													for (int l = 0; l < time; l++) {
														if (week[k][l] > 1) {
															overlap = true;
														}
													}
												}
												if (!overlap) {

													window.add(new EZgui());

													if (a > -1) {
														list[0][a].printCRN();
														list[0][a].printName();
													}
													if (b > -1) {
														list[1][b].printCRN();
														list[1][b].printName();
													}
													if (c > -1) {
														list[2][c].printCRN();
														list[2][c].printName();
													}
													if (d > -1) {
														list[3][d].printCRN();
														list[3][d].printName();
													}
													if (e > -1) {
														list[4][e].printCRN();
														list[4][e].printName();
													}
													if (f > -1) {
														list[5][f].printCRN();
														list[5][f].printName();
													}
													if (g > -1) {
														list[6][g].printCRN();
														list[6][g].printName();
													}
													if (h > -1) {
														list[7][h].printCRN();
														list[7][h].printName();
													}
													if (i > -1) {
														list[8][i].printCRN();
														list[8][i].printName();
													}
													if (j > -1) {
														list[9][j].printCRN();
														list[9][j].printName();
													}
													for (int k = 0; k < weekLength; k++) {
														for (int l = 0; l < time; l++) {
															System.out.print(week[k][l] + " ");
															if (week[k][l] == 1) {
																window.get(window.size() - 1).fillTimeSlot(
																		(int) (k * EZgui.x / 8 + EZgui.x * 5 / 16),
																		l * EZgui.y / 144);
															}
														}
														System.out.println("");
													}
												}
												System.out.println("");
												overlap = false;
												if (j > -1) {
													for (int k = 0; k < weekLength; k++) {
														for (int l = 0; l < time; l++) {
															week[k][l] -= list[9][j].ls(k, l);
														}
													}
												}
											}
											if (i > -1) {
												for (int k = 0; k < weekLength; k++) {
													for (int l = 0; l < time; l++) {
														week[k][l] -= list[8][i].ls(k, l);
													}
												}
											}
										}
										if (h > -1) {
											for (int k = 0; k < weekLength; k++) {
												for (int l = 0; l < time; l++) {
													week[k][l] -= list[7][h].ls(k, l);
												}
											}
										}
									}
									if (g > -1) {
										for (int k = 0; k < weekLength; k++) {
											for (int l = 0; l < time; l++) {
												week[k][l] -= list[6][g].ls(k, l);
											}
										}
									}
								}
								if (f > -1) {
									for (int k = 0; k < weekLength; k++) {
										for (int l = 0; l < time; l++) {
											week[k][l] -= list[5][f].ls(k, l);
										}
									}
								}
							}
							if (e > -1) {
								for (int k = 0; k < weekLength; k++) {
									for (int l = 0; l < time; l++) {
										week[k][l] -= list[4][e].ls(k, l);
									}
								}
							}
						}
						if (d > -1) {
							for (int k = 0; k < weekLength; k++) {
								for (int l = 0; l < time; l++) {
									week[k][l] -= list[3][d].ls(k, l);
								}
							}
						}
					}
					if (c > -1) {
						for (int k = 0; k < weekLength; k++) {
							for (int l = 0; l < time; l++) {
								week[k][l] -= list[2][c].ls(k, l);
							}
						}
					}
				}
				if (b > -1) {
					for (int k = 0; k < weekLength; k++) {
						for (int l = 0; l < time; l++) {
							week[k][l] -= list[1][b].ls(k, l);
						}
					}
				}
			}
			for (int k = 0; k < weekLength; k++) {
				for (int l = 0; l < time; l++) {
					week[k][l] -= list[0][a].ls(k, l);
				}
			}
		}
		scanner.close();
	}
}
