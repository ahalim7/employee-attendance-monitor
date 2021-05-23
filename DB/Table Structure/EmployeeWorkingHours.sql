USE [HRSchema]
GO

/****** Object:  Table [dbo].[EmployeeWorkingHours]    Script Date: 7/17/2018 10:49:36 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[EmployeeWorkingHours](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[date] [nvarchar](max) NOT NULL,
	[arrivalTime] [nvarchar](max) NOT NULL,
	[depatureTime] [nvarchar](max) NOT NULL,
	[hours] [int] NOT NULL,
	[minutes] [int] NOT NULL,
	[seconds] [int] NOT NULL,
	[FK_EmployeeID] [int] NOT NULL,
 CONSTRAINT [PK_EmployeeWorkingHours] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO

ALTER TABLE [dbo].[EmployeeWorkingHours]  WITH CHECK ADD  CONSTRAINT [FK_EmployeeWorkingHours_Employee] FOREIGN KEY([FK_EmployeeID])
REFERENCES [dbo].[Employee] ([employeeID])
ON UPDATE CASCADE
ON DELETE CASCADE
GO

ALTER TABLE [dbo].[EmployeeWorkingHours] CHECK CONSTRAINT [FK_EmployeeWorkingHours_Employee]
GO

